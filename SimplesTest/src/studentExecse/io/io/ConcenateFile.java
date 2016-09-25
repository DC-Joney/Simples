package studentExecse.io.io;

import java.io.*;

/**
 * Created by in IntelliJ IDEA.
 * io流处理
 *
 * @author Joney
 * @create 2016-09-21-13:33
 */


public class ConcenateFile {
    public static void concenateFile(String...fileName){
        String str=null;
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(new File("D:\\sql.data")));) {
            for (String name : fileName) {
                BufferedReader reader=new BufferedReader(new FileReader(name));
                while ((str=reader.readLine())!=null){
                        writer.write(str);
                        writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static  void getUnicode() throws IOException {
        File file = new File("D:\\data.txt");
        InputStream in= new FileInputStream(file);
        byte[] b = new byte[5];
        in.read(b);
//        in.close()
        //EditPlus的save as成为其他unicode的编码 是不可行的
        //一般在记事本中修改
            if (b[0] == -17 && b[1] == -69 && b[2] == -65)
                System.out.println(file.getName() + "：编码为UTF-8");
            else
                System.out.println(file.getName() + "：可能是GBK，也可能是其他编码");


        if (in != null) {
            studentExecse.inheritance.day20.exception.Closeable.close(in);
        }
    }
    public static void main(String[] args) {
        if (args.length<0){
            System.out.println("Usage:java Concatenate file1 file2");
            System.exit(0);
        }
        concenateFile(args);
        System.out.println("successfully");
      //  System.out.println(args[1]);
        try {
            getUnicode();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
