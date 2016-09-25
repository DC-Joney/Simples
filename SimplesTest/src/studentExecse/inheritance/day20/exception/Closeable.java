package studentExecse.inheritance.day20.exception;

/**
 * Created by in IntelliJ IDEA.
 * 关闭流
 *
 * @author Joney
 * @create 2016-09-20-17:54
 */


public class Closeable {
    public static void close(AutoCloseable closeable){
        try {

            closeable.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
