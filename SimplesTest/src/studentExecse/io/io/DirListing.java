package studentExecse.io.io;

import studentExecse.inheritance.day20.exception.Closeable;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by in IntelliJ IDEA.
 * nio path用法处理nio流
 *
 * @author Joney
 * @create 2016-09-21-18:34
 */


public class DirListing {
    public static void main(String[] args) {
        if(args.length<1) {
            System.out.println("Usage :DirListing");
        }
            Path path= Paths.get(args[0]);
            DirectoryStream <Path>director=null;


            try {
                director= Files.newDirectoryStream(path);
                //System.out.println("aa");
                //System.out.println(director);
                for (Path path1 : director) {
                  //  System.out.println(path1);
                    System.out.println(path1.getFileName());

                }

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Invalid path specified:" + args[0]);
            }
            finally {
                if(director!=null)
                    Closeable.close(director);
                }
            }
        }
 class ArraysSort{
     public static void main(String[] args) {
         int[]ar={1,2,3,4,5,6,7,8};
         for(int i=0,j=ar.length-1;i<4 && j>=0;i++,j--){
             int demo;
             demo=ar[i];
             System.out.println(demo);
             ar[i]=ar[j];
             System.out.println(ar[i]);

             ar[j]=demo;
             System.out.println(ar[j]);

             System.out.println("i : "+ar[i]);
             System.out.println(demo);
             System.out.println("j : " +ar[j]);

         }
         for(int i=0;i<4;i++){
             System.out.print(ar[i]);
         }
     }
 }


