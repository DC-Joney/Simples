package studentExecse;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import  org.junit.Test;
/**
 * Created by Administrator on 2016/9/9.
 */
public class StudentExecseTest {
            Logger log= LogManager.getLogger(StudentExecseTest.class);

    public double getMaxDouble() {
        double a = 4.0;
        double b = 5.0;
        double c = 6.0;
        double h = a < c && a < b ? a : 0;
        double q = b < a && b < c ? b : 0;
        double r = c < a && c < b ? c : 0;
        if (h == 0 && q == 0) {
            return r;
        } else if (h == 0 && r == 0) {
            return q;
        } else {
            return r;
        }
    }

    @org.junit.Test
    public void calcTest() {
        Scanner sc = new Scanner(System.in);
        sc.next();
    }

    //    public  void test1(String[]args){
//        System.out.println(args.getClass());
//    }
    //
//System.out.println(s+"\"asas\"");输出带""的字符串
//
// 不定型参数类型必须放在形参列表的最后一位
    public void test1(String arg, String... args) {
        System.out.println(arg);

        System.out.println(arg.getClass());
        System.out.println("----------");
        for (String s : args) {
            System.out.println(s + "\"哦哦哦\"");
        }
    }

    //public void test1(String arg,String...args)
    //如果位这两种方法带进去一些参数那么java编译器 讲告诉我们不能识别 因为他们两个的优先级相同，并且参数都可以匹配上 所以不知道到底选择哪一个
//    public  void  test1(String...args){
//        System.out.println("ControllerServiceTest.test1....");
//    }
//    public  void  test1(Object...ars){
//        System.out.println("....");
//    }
    @Test
    public void test0() {
        String[] aa = new String[]{"aa"};

        this.test1("aa");
        System.out.println("**********");
        this.test1("aa", "bb");
        System.out.println("*********");
        //默认带进去的第一个String类型参数为arg
        this.test1("aa", "bb", "cc");


        System.out.println(byte.class);
        System.out.println(char.class);
    }

    public <E> List<E> getName(E... args) {
        List<E> list = new ArrayList<E>();
        for (E arg : args) {
            list.add(arg);
        }
        return list;

    }

    @Test
    private void getList() {
        List<String> list = this.<String>getName("aa", "bb", "cc");
        for (String s : list) {
            log.info(s);
        }
    }
}
