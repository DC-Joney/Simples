package studentExecse.inheritance.day19;

/**
 * Created by in IntelliJ IDEA.
 * 模板设计模式
 *
 * @author Joney
 * @create 2016-09-19-10:22
 */


public abstract class Template {
    abstract void code();
    public void getTime(){
        long start=System.currentTimeMillis();
        code();
        long end=System.currentTimeMillis();
        System.out.println("时间为 : "+(end-start));
    }

}
class SubTime extends  Template{
    @Override
    public void code() {
        System.out.println(12);
        for (int i=0;i<100000;i++){
            System.out.println();
        }
    }
}
class TemplateTest{
    public static void main(String[] args) {
        Template template=new SubTime();
        template.getTime();
    }
}
