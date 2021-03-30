package com.huazai.plus.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.BindingResult;

/**
 * 
 * @description
 *              <li>数据响应实体
 * @class ResponseData
 * @package com.huazai.plus.response
 * @contact who.seek.me@java98k.vip
 * @created 2017年5月1日
 *
 * @version V1.0.0
 * @author HuaZai
 */
public class ResponseData extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    public ResponseData() {
        put("code", 200);
        put("msg", "success");
    }

    public static ResponseData failure() {
        return failure(500, "未知异常，请联系系统管理员");
    }

    public static ResponseData failure(String msg) {
        return failure(500, msg);
    }
    
    public static ResponseData failure(BindingResult bindingResult) {
        ResponseData responseData = new ResponseData();
        responseData.put("code", 500);
        responseData.put("data", bindingResult);
        
        return responseData;
    }

    public static ResponseData failure(int code, String msg) {
        ResponseData responseData = new ResponseData();
        responseData.put("code", code);
        responseData.put("msg", msg);
        return responseData;
    }

    public static ResponseData success(String msg) {
        ResponseData responseData = new ResponseData();
        responseData.put("msg", msg);
        return responseData;
    }
    
    public static ResponseData success(String code,String msg,Object data) {
        ResponseData responseData = new ResponseData();
        responseData.put("code", code);
        responseData.put("msg", msg);
        responseData.put("data", data);
        
        return responseData;
    }
    
    public static ResponseData success(Object data) {
    	ResponseData responseData = new ResponseData();
    	responseData.put("code", 200);
    	responseData.put("msg", "success");
    	responseData.put("data", data);
    	
    	return responseData;
    }

    public static ResponseData success(Map<String, Object> map) {
        ResponseData responseData = new ResponseData();
        responseData.putAll(map);
        return responseData;
    }

    public static ResponseData success() {
        return new ResponseData();
    }

    @Override
    public ResponseData put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
