package studentExecse.inheritance.day20.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by in IntelliJ IDEA.
 * 测试异常
 *throws异常处理的一种方式 抛出的是异常类
 * throw是手动抛出异常 抛出的是异常对象
 * @author Joney
 * @create 2016-09-21-10:50
 */


public class FileUtil {
    public static void readFile() throws FileNotFoundException {
        StringBuilder builder=new StringBuilder();
        Scanner scanner=new Scanner(new FileInputStream(new File("D:\\data.txt")));
        Throwable localThrowbale2=null;
        try {
            while(scanner.hasNext()){
            builder.append(scanner.next());
            builder.append('\n');

        }

        }catch(Throwable localThrowable){
            localThrowbale2=localThrowable;
            throw localThrowable;
        }finally {
            if(scanner!=null) {
                if(localThrowbale2!=null) {
                    try {
                        scanner.close();
                    }catch (Throwable t2){
                        localThrowbale2.addSuppressed(t2);
                        System.out.println(localThrowbale2);
                        t2.printStackTrace();
                    }
                }else {
                    scanner.close();
                }
            }
        }

    }

    public static void main(String[] args) throws FileNotFoundException {

        readFile();
    }

}
