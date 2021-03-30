package com.huazai.plus.aspect;

import com.alibaba.fastjson.JSONObject;
import com.huazai.plus.annotation.LogOperate;
import com.huazai.plus.utils.TokenUtil;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Marker;
import org.slf4j.helpers.BasicMarkerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * 
 * @description
 *              <li>日志切面
 * @class LogAspect
 * @package com.huazai.plus.aspect
 * @contact who.seek.me@java98k.vip
 * @created 2017年5月1日
 *
 * @version V1.0.0
 * @author HuaZai
 */
@Slf4j
@Aspect
@Component
public class LogAspect {


    @Value("${spring.application.name:none}")
    private String application_name;

    /**
     * Description:[切入点]
     * 
     * @date 2017年5月1日
     * @author	HuaZai
     */
    @Pointcut("@annotation(com.huazai.plus.annotation.LogOperate)")
    public void logPointCut() {
    	// TODO
    }

    /**
     * Description:[环绕接入]
     * 
     * @date 2017年5月1日
     * @author	HuaZai
     */
    @Around("logPointCut()&&@annotation(logPointCut)")
    public Object around(ProceedingJoinPoint point, LogOperate LogOperate) throws Throwable {
        Object result;
        JSONObject jb=new JSONObject();
        jb.put("requestTime", LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli());
        jb.put("logType", "todo");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String token = request.getHeader("Authorization");
        if (StringUtils.isNotBlank(token)) {
                JSONObject user=TokenUtil.getPlayload(token);
                jb.put("userId",user.containsKey("userId")?user.getString("userId"):"");
                jb.put("username",user.containsKey("username")?URLDecoder.decode(user.getString("username"), "utf-8"):"");
                jb.put("displayName", user.containsKey("name")?URLDecoder.decode(user.getString("name"), "utf-8"):"");
                jb.put("system",application_name);
                jb.put("module",LogOperate.module());
                jb.put("function",LogOperate.function());
                jb.put("description",LogOperate.description());
                Object[] param = point.getArgs();
                jb.put("param",param!=null&&param.length>0?param[0]:"");
            }
            long beginTime = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
            // 执行方法
            result = point.proceed();
            // 执行时长(毫秒)
            long time = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli() - beginTime;
            jb.put("timeCost",time+"/ms");
        //记录日志
        Marker marker = new BasicMarkerFactory().getMarker("todo");
        log.info(marker,jb.toJSONString());
        return result;
    }
}
