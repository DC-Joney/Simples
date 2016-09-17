package studentExecse.inheritance.day13;

/**
 * Created by Administrator on 2016/9/13.
 */
public class Test{
    public void test(){

    }
    public  static  class Test2 extends Test{
        @Override
        public void test(){

        }
    }
    public static void main(String[] args) {
        Test test1=new Test1();
        Test test=new Test2();
        ((Test1)test).test();



    }
}
class  Test1 extends Test{
    @Override
    public void test(){
        System.out.println("Test1.test");
    }
    public void  test2(){
        System.out.println("Test1.test2");
    }
}
