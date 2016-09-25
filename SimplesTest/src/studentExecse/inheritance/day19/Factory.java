package studentExecse.inheritance.day19;

/**
 * Created by in IntelliJ IDEA.
 * 简单工厂模式
 *
 * @author Joney
 * @create 2016-09-19-15:44
 */


public class Factory<T>{
    //private static Class<?>cls;
//    public static Work getWork(){
//        if(work==null){
//            work=new StudentWork();
//            return  work;
//        }
//        return work;
//    }
//    @org.junit.Test
//    public void test() throws IllegalAccessException, InstantiationException {
////        Class<?>cls=Work.class;
////        System.out.println(Work.class.newInstance());
////        System.out.println(cls.isInstance(student));
//        Work work= getWork();
//        Work work1=getWork();
//        System.out.println(work==work1);
//
//    }
    private static Handler handler;
    private static StudentWork student;
    private static <T> Handler getInstance(Class<T>cls) throws Exception {
        if(handler==null){
             handler= (Handler) cls.newInstance();
            return handler;
        }
        return handler;
    }
    public static <T>  Handler getWork(Class<T> cls) throws Exception {
        return (Handler) getInstance(cls);
    }
}

interface Work{
    void work();
}
interface IWorkFactory{
    <T> void getWork(T t);
}
abstract class Handler implements Work{
        private  Handler handler;

    public Handler() {
    }

    public Handler(Handler handler){
          this.handler= handler;
            this.handler.handle();
        }
        public  void handle(){
            handler.work();
        }
}
class TeachWork extends Handler{
    @Override
    public void work() {

    }
}
class StudentWork extends Handler{
    @Override
    public void work() {
        System.out.println("StudentWork.work");
    }
}
//class WorkFactory implements IWorkFactory{
//    @Override
//    public <T> void getWork(T t) {
//        Factory.getWork(t).work();
//    }
//}
class Test{
    public void study(Work work){

    }

    public static void main(String[] args) throws Exception {

       Work work=new StudentWork();
        new Test().study(Factory.getWork(StudentWork.class));
    }
}