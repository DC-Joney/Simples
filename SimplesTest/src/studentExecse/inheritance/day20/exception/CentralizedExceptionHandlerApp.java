package studentExecse.inheritance.day20.exception;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by in IntelliJ IDEA.
 * 异常处理
 *
 * @author Joney
 * @create 2016-09-20-21:13
 */


public class CentralizedExceptionHandlerApp {
    private static Logger log= LogManager.getLogger(CentralizedExceptionHandlerApp.class);
    private static BufferedReader reader=null;
    public void openDataFile(String fileName){
        try {
            reader=new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            Throwable throwble=new Throwable();
            throwble.initCause(e);
            log.error(throwble.getCause());
        }
    }

    public void readData(){
        String str;
        try {
            while ((str = reader.readLine())!=null){
                    int n=Integer.parseInt(str);
                System.out.println(n);
            }
        } catch (IOException e) {
            log.error(e);
        }catch(NumberFormatException e){
            log.error(e);
        }
    }
    public static void main(String[] args) {
        String urlStr=null;

        try {
            CentralizedExceptionHandlerApp app=
                    new CentralizedExceptionHandlerApp();

        app.openDataFile("data.txt");
        app.readData();
        } catch (Exception e){
            Throwable throwble=new Throwable();
            throwble.initCause(e);
            log.error(throwble.getCause());
        }finally {
            if (reader!=null) {
                Closeable.close(reader);
            }
        }

    }

}
