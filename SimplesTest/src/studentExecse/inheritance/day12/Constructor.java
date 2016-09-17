package studentExecse.inheritance.day12;

/**
 * Created by Administrator on 2016/9/13.
 * 构造器链
 */
public class Constructor {
    public Constructor() {
        System.out.println("Constructor.Constructor");
    }

}
class Child extends Constructor{
    public  Child(){
        System.out.println("Child.Child");
    }
}
class  Child1 extends Child{
    public Child1() {
        System.out.println("Child1.Child1");
    }
}
class Child2 extends  Child1{
    public Child2() {
        System.out.println("Child2.Child2");
    }

    public static void main(String[] args) {
        Child2 child2=new Child2();

    }
}