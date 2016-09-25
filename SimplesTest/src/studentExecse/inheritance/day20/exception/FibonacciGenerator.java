package studentExecse.inheritance.day20.exception;

/**
 * Created by in IntelliJ IDEA.
 * 打印堆栈信息
 *
 * @author Joney
 * @create 2016-09-20-22:18
 */


public class FibonacciGenerator {
    public static int generate(int n){
        Throwable t=new Throwable();
        StackTraceElement[]frams=t.getStackTrace();
        for(StackTraceElement s:frams){
            System.out.println("Calling "+s);

        }
        if (n<=2){
                return 1;
        } else {
          return generate(n-1)+generate(n-2);
        }
    }
    public static void main(String[] args) {
                generate(3);
    }
}
