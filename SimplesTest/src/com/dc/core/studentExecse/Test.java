package com.dc.core.studentExecse;

/**
 * Created by Administrator on 2016/9/10.
 */
public class Test {
    public static void main(String[] args) {
        Base base=new Sub();
        base.display();
        System.out.println(base.count);
    }
}
class Base{
    int count=10;
    public void display(){
        System.out.println(count);
    }
}
class Sub extends Base{
    int count=20;

    @Override
    public void display() {
        System.out.println(count);
    }

}