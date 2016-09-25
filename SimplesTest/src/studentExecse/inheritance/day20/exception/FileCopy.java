package studentExecse.inheritance.day20.exception;

import java.io.*;

/**
 * Created by in IntelliJ IDEA.
 * 文件复制
 *
 * @author Joney
 * @create 2016-09-20-22:25
 */


public class FileCopy {


    public static void main(String[] args) {
        try {
            InputStream fis=new FileInputStream(new File("D:\\a.txt"));
            //ObjectOutput fos=new FileInputStream("");
            byte[]buf=new byte[8192];
            int i;
            while ((i=fis.read(buf))!=-1){
                    //fos.write(buf,0,1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
