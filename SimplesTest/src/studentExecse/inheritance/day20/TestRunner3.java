package studentExecse.inheritance.day20;

/**
 * Created by in IntelliJ IDEA.
 * 匿名类做监听器
 *
 * @author Joney
 * @create 2016-09-20-10:34\
 *
 *代码的设计模式不错
 *
 */


public class TestRunner3 {
    public static void main(String[] args) {
        new Button().setOnclickListener(new OnClickListenner() {
            @Override
            public void click() {
                System.out.println("谁点我啦?");
            }
        });
    }
}
interface OnClickListenner{
    void click();
}
class Button{
    public void setOnclickListener(OnClickListenner listener) {
        listener.click();
    }
}
