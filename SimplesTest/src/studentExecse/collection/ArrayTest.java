package studentExecse.collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by in IntelliJ IDEA.
 *
 * @author Joney
 * @create 2016-09-23-16:38
 */


public class ArrayTest {
    int q=0;
    public  Integer add(){
        q++;
        return q;
    }
    public static void main(String[] args) {
       // static ArrayList<Integer> ar;

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                ArrayList<Integer>ar=new ArrayList<Integer>();
                @Override
                public void run() {
                        //ar.add();
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread()+" "+ Arrays.asList(ar)+"***");
                    }

            }).start();
        }

    }
}
