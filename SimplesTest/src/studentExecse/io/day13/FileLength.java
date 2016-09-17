package studentExecse.io.day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2016/9/13.
 */
public class FileLength {
    public static void main(String[] args)  {
        String[]arg=new String[]{"E:\\aa.txt","2","3","4","5","6","7","8"};
        int count=0;
        InputStream stream=null;
        if(arg.length<1){
            System.out.println("Usage :java FilelENTTH");
            System.exit(0);
        }

            try {
                stream=new FileInputStream(arg[0]);
                while(stream.read()!=-1){
                    count++;
                }
                System.out.println(arg[0] + " length = " + count);
                stream.close();
            } catch (FileNotFoundException e) {
                System.out.println("File1 " + arg[0] + " was not found");
                System.exit(0);
                e.printStackTrace();
            } catch (IOException e){
                System.out.println("Error reading file1");
                e.printStackTrace();
            }finally {
                if(stream!=null){
                    try {
                        stream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }


    }

}
