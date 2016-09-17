package com.dc.core.exception.exception.framework;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/12.
 */
public class BaseRuntimeException extends RuntimeException{
    private List<Throwable> exceptions=new ArrayList<Throwable>();
    public BaseRuntimeException() {
    }

    public BaseRuntimeException(String message) {
        super(message);
    }
    public void  addException(Throwable exception){
        if (exception != null) {
           exceptions.add(exception);
        }
    }
    public  boolean isThrowRequired(){
        return  exceptions.size()>0;
    }
    public BaseRuntimeException(Throwable cause) {
        super(cause);
    }

    public BaseRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
