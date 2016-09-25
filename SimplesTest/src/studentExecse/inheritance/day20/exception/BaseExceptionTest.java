package studentExecse.inheritance.day20.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by in IntelliJ IDEA.
 * 异常重复捕获
 *
 * @author Joney
 * @create 2016-09-20-18:33
 */


public class BaseExceptionTest {
    public static void main(String[] args) {
        String str="D:\\data1.txt";
        try {
            FileInputStream inputStream=new FileInputStream(str);
        } catch (FileNotFoundException e) {
            try {
                throw new BaseException(e);
            } catch (Throwable throwable) {
                System.out.println(throwable.getCause());
            }
        }

    }
}
