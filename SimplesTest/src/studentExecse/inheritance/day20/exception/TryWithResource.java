package studentExecse.inheritance.day20.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by in IntelliJ IDEA.
 * 捕捉异常
 *
 * @author Joney
 * @create 2016-09-21-10:27
 */


public class TryWithResource {
    class NullException extends Exception{
        public NullException(String message) {
            super(message);
        }
    }
   public Integer getNumber()throws NumberFormatException{
        int i=Integer.parseInt("");
        return i;
    }
    public static void main(String[] args) throws Throwable {

        try(FileInputStream fileInputStream=new FileInputStream("D:\\data1.txt")){
            //fileInputStream.read();

        } catch (FileNotFoundException e) {
            Throwable t=new Throwable();
            t.initCause(e);
            throw t.getCause();
            //e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

}
