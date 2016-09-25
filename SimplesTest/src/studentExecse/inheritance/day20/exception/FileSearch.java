package studentExecse.inheritance.day20.exception;

import java.io.*;

/**
 * Created by in IntelliJ IDEA.
 * 异常重新捕获注重在 initcause
 *
 * @author Joney
 * @create 2016-09-20-17:42
 */


public class FileSearch {
    public static void main(String[] args)  {
        BufferedReader input=null;
        TestException exception = new TestException();
        try {
             input= new BufferedReader(new FileReader("D:\\data2.txt"));
        } catch (FileNotFoundException e) {
            //exception.initCause(e);
            //将捕捉的异常的底层信息 添加到exception中
            exception.addException(exception.initCause(e));
//            exception.initCause(e);
//            exception.getCause();

        } finally {
            if(input!=null){
                Closeable.close(input);
            }
            if(exception.isEmpty()){
                //Throwable throwable=exception.getCause().fillInStackTrace();
                //throwable.initCause(exception.getCause());
               // System.out.println(throwable.getMessage());
                //exception.getCause();
                //exception.getCause();
                //抛出本异常加底层异常
                //throw exception;
                //只打印相关的信息 不打印具体哪里出错
                try {
                    throw (IOException)exception.getCause().fillInStackTrace();
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }


//                try {
//                    throw (IOException) throwable;
//                } catch (IOException e) {
//                    throwable.printStackTrace();
//                }

            }

        }
    }
}
