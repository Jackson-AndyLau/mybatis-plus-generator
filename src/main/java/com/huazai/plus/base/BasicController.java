package com.huazai.plus.base;

import com.alibaba.fastjson.JSONObject;
import com.huazai.plus.common.Constant;
import com.huazai.plus.entity.SysUser;
import com.huazai.plus.enums.ResponseCodeEnum;
import com.huazai.plus.exception.AppException;
import com.huazai.plus.utils.TokenUtil;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * 
 * @description
 *              <li>公共BasicController类，所有Controller的基类
 * @class BasicController
 * @package com.huazai.plus.base
 * @contact who.seek.me@java98k.vip
 * @created 2017年5月1日
 *
 * @version V1.0.0
 * @author HuaZai
 */
@Slf4j
public class BasicController {

	@Autowired
	private HttpServletRequest request;

	/**
	 * Description:[获取当前登录用户的Token]
	 *
	 * @return String
	 * @date 2017年5月1日
	 * @author HuaZai
	 */
	protected String getCurrentToken() {
		return request.getHeader(Constant.HEADER_TOKEN);
	}

	/**
	 * Description:[获取当前登录用户ID]
	 *
	 * @return String
	 * @date 2017年5月1日
	 * @author HuaZai
	 */
	protected String getCurrentUserId() throws AppException {
		try {
			String token = request.getHeader(Constant.HEADER_TOKEN);
			String currentId = TokenUtil.getUserId(token);
			if (StringUtils.isEmpty(currentId)) {
				throw new AppException(ResponseCodeEnum.Forbidden);
			}
			return currentId;
		} catch (UnsupportedEncodingException e) {
			log.warn("Token is invalid! ", e);
			throw new AppException(ResponseCodeEnum.Forbidden);
		}
	}

	/**
	 * Description:[获取当前登录用户姓名]
	 *
	 * @return String
	 * @date 2017年5月1日
	 * @author HuaZai
	 */
	protected String getCurrentUserName() throws AppException {

		try {
			String token = request.getHeader(Constant.HEADER_TOKEN);
			String currentName = TokenUtil.getUserName(token);
			return currentName;
		} catch (UnsupportedEncodingException e) {
			log.warn("Token is invalid ", e);
			throw new AppException(ResponseCodeEnum.Forbidden);
		}
	}

	/**
	 * Description:[获取当前登录用户信息]
	 *
	 * @return String
	 * @date 2017年5月1日
	 * @author HuaZai
	 */
	protected SysUser getCurrentUser() throws AppException {

		try {
			String token = request.getHeader(Constant.HEADER_TOKEN);
			JSONObject playload = TokenUtil.getPlayload(token);
			SysUser sysUser = playload.toJavaObject(SysUser.class);
			sysUser.setName(URLDecoder.decode(sysUser.getName(), "utf-8"));
			sysUser.setUsername(URLDecoder.decode(sysUser.getUsername(), "utf-8"));
			return sysUser;
		} catch (UnsupportedEncodingException e) {
			log.warn("Token is invalid ", e);
			throw new AppException(ResponseCodeEnum.Forbidden);
		}
	}

}
