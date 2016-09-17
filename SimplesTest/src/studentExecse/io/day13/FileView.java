package studentExecse.io.day13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/9/13.
 */
public class FileView {
    public  static void close(AutoCloseable closeable){
        try {
            if (closeable!=null)
            closeable.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String[]arg=new String[]{"E:\\aa.txt","E:\\bb.txt","3","4","5","6","7","8"};

        int numberRead=0;
        FileReader reader=null;
        PrintWriter writer=null;
        char buffer[]=new char[512];
        if(arg.length<1){
            System.out.println("没有文件");
            System.exit(0);
        }
        try {
            reader=new FileReader(arg[0]);
            writer=new PrintWriter(arg[1]);
            while ((numberRead=reader.read(buffer))!=-1){
                writer.write(buffer,0,numberRead);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error Reading");

        }finally {
            close(writer);
            close(reader);

        }

        }
    }

