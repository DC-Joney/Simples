package studentExecse.inheritance.day13;

import org.junit.Test;

/**
 * Created by Administrator on 2016/9/13.
 * 静态字段也可以被继承的
 * 多态:编译看左边 运行看右边
 */

public class RetBall extends Ball{
    @Test
    public  void test(){
        System.out.println(RetBall.string);
    }

}
class  Ball{
    public static String  string="我是大傻子 嘎嘎啊";
}
