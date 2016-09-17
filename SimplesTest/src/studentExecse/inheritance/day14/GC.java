package studentExecse.inheritance.day14;

/**
 * Created by Administrator on 2016/9/14.
 *
 * System.gc();是为了唤醒Object类的垃圾回收方法 、
 *当前对象置为空时 gc不会唤醒GC来回收堆空间
 * 当 再次声明对象时 才会执行gc方法来为当前对象腾出空间
 */
public class GC {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("垃圾回收器执行中...");
    }


    public static void main(String[] args) {
        GC gc=new GC();
        gc=null;
        System.gc();
        GC gc1=new GC();
    }
}
