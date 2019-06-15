package com.huazai.plus.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @description
 *              <li>数据响应实体
 * @class ResponseData
 * @package com.huazai.plus.common
 * @contact who.seek.me@java98k.vip
 * @created 2017年5月1日
 *
 * @version V1.0.0
 * @author HuaZai
 */
public class ResponseData extends HashMap<String, Object>
{

	/**
	 * serialVersionUID: [变量简单描述]
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Description: [success]
	 */
	public ResponseData()
	{

		put("code", 0);
		put("msg", "success");
	}

	/**
	 * Description:[未知异常]
	 *
	 * @return ResponseData
	 */
	public static ResponseData error()
	{

		return error(500, "系统异常，请联系管理处理");
	}

	/**
	 * Description:[错误消息]
	 *
	 * @param msg
	 *            [msg]
	 * @return ResponseData
	 */
	public static ResponseData error(final String msg)
	{

		return error(500, msg);
	}

	/**
	 * Description:[错误数据]
	 *
	 * @param code
	 *            [状态码]
	 * @param msg
	 *            [错误信息]
	 * @return ResponseData
	 */
	public static ResponseData error(final int code, final String msg)
	{

		ResponseData responseData = new ResponseData();
		responseData.put("code", code);
		responseData.put("msg", msg);
		return responseData;
	}

	/**
	 * Description:[返回success]
	 *
	 * @return ResponseData
	 */
	public static ResponseData ok()
	{

		return new ResponseData();
	}

	/**
	 * Description:[返回数据消息]
	 *
	 * @param map
	 *            [map]
	 * @return ResponseData
	 */
	public static ResponseData ok(final Map<String, Object> map)
	{

		ResponseData responseData = new ResponseData();
		responseData.putAll(map);
		return responseData;
	}

	/**
	 * Description:[返回成功消息]
	 *
	 * @param msg
	 *            [msg]
	 * @return ResponseData
	 */
	public static ResponseData ok(final String msg)
	{

		ResponseData responseData = new ResponseData();
		responseData.put("msg", msg);
		return responseData;
	}

	/**
	 * Description:[方法功能简单描述]
	 * 
	 * @param key
	 *            [参数简单描述]
	 * @param value
	 *            [参数简单描述]
	 * @return ResponseData
	 */
	@Override
	public ResponseData put(final String key, final Object value)
	{

		super.put(key, value);
		return this;
	}
}
