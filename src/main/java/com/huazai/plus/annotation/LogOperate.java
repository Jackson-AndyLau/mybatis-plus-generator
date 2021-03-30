package com.huazai.plus.annotation;

import java.lang.annotation.*;

/**
 * 
 * @description
 *              <li>日志操作注解
 * @class LogOperate
 * @package com.huazai.plus.annotation
 * @contact who.seek.me@java98k.vip
 * @created 2017年5月1日
 *
 * @version V1.0.0
 * @author HuaZai
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogOperate {
    /**
     * 模块
     * @return
     */
    String module() default "";

    /**
     * 方法
     * @return
     */
    String function() default "";

    /**
     * 描述
     * @return
     */
    String description() default "";

}
