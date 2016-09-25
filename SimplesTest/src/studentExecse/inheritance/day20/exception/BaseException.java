package studentExecse.inheritance.day20.exception;

/**
 * Created by in IntelliJ IDEA.
 * 自定义异常
 *
 * @author Joney
 * @create 2016-09-20-16:38
 */


public class BaseException extends RuntimeException{
    public BaseException() {
        super();
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    protected BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
