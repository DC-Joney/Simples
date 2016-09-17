package com.dc.core.exception.exception.framework;

/**
 * Created by Administrator on 2016/9/12.
 */
public class DataAccessException extends  BaseRuntimeException{
    public DataAccessException() {

    }

    public DataAccessException(String message) {
        super(message);
    }

    public DataAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataAccessException(Throwable cause) {
        super(cause);
    }
}
