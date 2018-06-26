package com.zb.mall.commons.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Administrator on 2018/6/26 0026.
 */
@Getter
@Setter
public class LogicException extends RuntimeException {

    private static final long serialVersionUID = -7034897190745766969L;

    private String errorCode;

    private String errorMessage;

    public LogicException() {
    }

    public LogicException(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public LogicException(String message, String errorCode, String errorMessage) {
        super(message);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public LogicException(String message, Throwable cause, String errorCode, String errorMessage) {
        super(message, cause);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public LogicException(Throwable cause, String errorCode, String errorMessage) {
        super(cause);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public LogicException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String errorCode, String errorMessage) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
