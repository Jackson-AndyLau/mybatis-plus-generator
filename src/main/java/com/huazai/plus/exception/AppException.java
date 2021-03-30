package com.huazai.plus.exception;

import com.huazai.plus.enums.ResponseCodeEnum;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * @description
 *              <li>全局异常类
 * @class AppException
 * @package com.huazai.plus.annotation
 * @contact who.seek.me@java98k.vip
 * @created 2017年5月1日
 *
 * @version V1.0.0
 * @author HuaZai
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class AppException extends Exception{
	
    @SuppressWarnings("unused")
	private int code;
    @SuppressWarnings("unused")
	private String message;

    static final long serialVersionUID = -3387516993124229948L;

    public AppException() {
        super();
    }

    public AppException(String message) {
        super(message);
        this.code = ResponseCodeEnum.Failure.getCode();
        this.message = message;
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppException(Throwable cause) {
        super(cause);
    }

    protected AppException(String message, Throwable cause,
                           boolean enableSuppression,
                           boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public AppException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public AppException(ResponseCodeEnum responseCode) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
    }
}
