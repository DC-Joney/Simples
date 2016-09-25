package studentExecse.inheritance.day19.handler;

/**
 * Created by in IntelliJ IDEA.
 * 责任链模式
 *
 * @author Joney
 * @create 2016-09-19-19:33
 */


public class Handler {

}
interface  RequestHandle{
    void requestHandle();
}
class HRRequestHandle implements RequestHandle{

    private ContextHandle contextHandle=getContextHandle();
    private ContextHandle getContextHandle(){
        contextHandle.registory(new XmlHandle());
        if(HandleBool.aBoolean=true){
            contextHandle.registory(new PrintHandle());
        }
        return contextHandle;
    }
    @Override
    public void requestHandle() {

        System.out.println("HRRequestHandle.requestHandle");
    }
}
class PMRequestHandle implements RequestHandle{
    @Override
    public void requestHandle() {
        System.out.println("PMRequestHandle.requestHandle");
    }
}
class TLRequestHandle implements RequestHandle{
    @Override
    public void requestHandle() {
        System.out.println("TLRequestHandle.requestHandle");
    }
}
class test{
    public static void main(String[] args) throws Exception {
        //System.out.println(Arrays.binarySearch(new test().getClass().getInterfaces(),RequestHandle.class));
//        System.out.println(RequestHandle.class);
//        for (Class cls:new test().getClass().getInterfaces()){
//            if(cls==RequestHandle.class){
//                System.out.println("111");
//            }
//        }

    //new RequestHandleTest().handle(TLRequestHandle.class);
        RequestHandleTest requestHandleTest=new RequestHandleTest();
        requestHandleTest.handle(TLRequestHandle.class);
    }
}
class RequestHandleTest{
    private  Object requestHandle;
    private  Object getHandle(Class<?>cls) throws Exception {
        //实例化
      if(requestHandle==null){
          requestHandle =  Factory.getOneInstance(cls);
        return requestHandle;
      }
        return requestHandle;
       }
       public  <T> void handle(Class<?>cls) throws Exception {
           ((RequestHandle)getHandle(cls)).requestHandle();
       }
    }


class Factory{
    private static Object handler;
    private static <T> Object getInstance(Class<T>cls) throws Exception {
        if(handler==null){
            handler= (Object) cls.newInstance();
            return handler;
        }
        return handler;
    }
    public static <T> Object getOneInstance(Class<T> cls) {
        try {
            return (Object) getInstance(cls);
        } catch (Exception e) {
            throw new ClassCastException("类型不匹配");
        }
    }
}

