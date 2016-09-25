package studentExecse.inheritance.day20.exception;

/**
 * Created by in IntelliJ IDEA.
 * 异常补货
 *
 * @author Joney
 * @create 2016-09-20-16:15
 */


public class StackTraceDemo {
    static String a(){
        String text=null;
        return text.toUpperCase();
    }
    static void  b(){
        a();
    }

    static void c(){
        try {
            b();
        } catch (Exception e) {
           // e.printStackTrace();
            Throwable t=e.fillInStackTrace();
            throw (NullPointerException) t;
        }
    }

    public static void main(String[] args) {
        try {
            c();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
