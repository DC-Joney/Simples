package studentExecse.inheritance.day20.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by in IntelliJ IDEA.
 * 异常处理
 *
 * @author Joney
 * @create 2016-09-20-16:24
 */


public class ModifiedCentralizedExcetionHandlerApp {
    private static BufferedReader reader = null;

    public static void close(AutoCloseable closeable) {
        try {
            closeable.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void openDataFile(String fiileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fiileName));

    }

    void readData() throws IOException {
        String str;
        while ((str = reader.readLine()) != null) {
            int n = Integer.parseInt(str);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        String str = null;
        ModifiedCentralizedExcetionHandlerApp app
                = new ModifiedCentralizedExcetionHandlerApp();
        try {
            app.openDataFile("D:\\data1.txt");
            app.readData();

        } catch (Exception e) {
            //e.printStackTrace();
            Throwable t = e.fillInStackTrace();

            //System.out.println(t.initCause(e).getMessage());
            try {
                throw (IOException) t;
            } catch (IOException e1) {
                //System.out.println(e1.initCause(e1).getCause());
               // e1.initCause(e);
                //System.out.println(e1.getCause());
                e1.printStackTrace();
            } finally {
                if (reader != null) {
                    close(reader);
                }
            }

        }
    }
}
