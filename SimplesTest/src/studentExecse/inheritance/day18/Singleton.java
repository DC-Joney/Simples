package studentExecse.inheritance.day18;

import org.junit.*;

/**
 * Created by in IntelliJ IDEA.
 * 单例模式
 *
 * @author Joney
 * @create 2016-09-18-16:27
 */


public class Singleton {
    private static Singleton singleton;
    static {
        singleton=new Singleton();
    }
    @Ignore
    public static Singleton getSingleton(){
        if (singleton == null) {
            singleton=new Singleton();
        }
        return singleton;

    }
    public static Singleton getSingletonForHm(){
            return singleton;
    }
    @Ignore
    @Test
    public void comPareTo() {
        Singleton slg=Singleton.getSingleton();
        Singleton slg1=Singleton.getSingleton();
        Assert.assertEquals(slg,slg1);
    }
    @Test
    public void comPareToForHm() {
        Singleton slg=Singleton.getSingletonForHm();
        Singleton slg1=Singleton.getSingletonForHm();
        Assert.assertEquals(slg,slg1);
    }
}
