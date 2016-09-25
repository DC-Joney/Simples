package studentExecse.inheritance.day18;

/**
 * Created by in IntelliJ IDEA.
 * 初始化模块
 *
 * @author Joney
 * @create 2016-09-18-15:15
 */


public class Initialization {
    int i,j,k,l;
    static String a,s,d;
    static final int c;
    static {
        c=6;
        a="a";
        s="s";
        d="d";
        System.out.println(c);
    }
    {
        i=3;
        j=4;
        k=5;
        l=6;
        System.out.println(i);
    }

    public Initialization() {
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        new Initialization();
        new Initialization();
        new Initialization();
        new Initialization();
    }

}
