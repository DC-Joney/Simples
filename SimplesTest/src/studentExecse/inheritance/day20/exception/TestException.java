package studentExecse.inheritance.day20.exception;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by in IntelliJ IDEA.
 * 自定义异常类
 *
 * @author Joney
 * @create 2016-09-20-16:55
 */


public class TestException extends RuntimeException {
    private List<Throwable>list=new LinkedList<>();

    public TestException() {
        super();
    }

    public TestException(String message) {
        super(message);
    }

    public TestException(Throwable cause) {
        super(cause);
    }
    public void addException(Throwable exception){
        if(exception!=null){
            list.add(exception);
        }
    }
    public boolean isEmpty(){
        return list.size()>0;
    }
    public TestException(String message, Throwable cause) {
        super(message, cause);
    }


}
