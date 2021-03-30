package com.huazai.plus.enums;

/**
 * 
 * @description
 *              <li>数据响应CODE
 * @class ResponseCode
 * @package com.huazai.plus.enums
 * @contact who.seek.me@java98k.vip
 * @created 2017年5月1日
 *
 * @version V1.0.0
 * @author HuaZai
 */
public enum ResponseCodeEnum {
	
    OK(19200, "成功"),
    Failure(19400, "失败"),
    Unauthorized(19401, "token、用户名和密码校验失败"),
    Forbidden(19403, "无权限访问"),
    InternalServerError(19500, "服务器内部错误"),
    BadGateway(19502, "网关错误"),
    ServiceIsNotAvailable(19503, "服务器不可用"),
    PARAM_ERROR(19901, "参数错误"),
    PWD_ERROR(19902, "密码错误"),
    USERNAME_NOT_EXIST(19903, "用户名不存在");

    private final int code;
    private String message;

    ResponseCodeEnum(int state, String message) {
        this.code = state;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return message;
    }

}
