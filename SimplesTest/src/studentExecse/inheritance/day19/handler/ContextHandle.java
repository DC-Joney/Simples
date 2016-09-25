package studentExecse.inheritance.day19.handler;

/**
 * Created by in IntelliJ IDEA.
 * 处理handle类
 *
 * @author Joney
 * @create 2016-09-19-21:14
 */


public class ContextHandle {
    private Request firstRequest=null;
    public Request registory(Request request){
        request.setRequest(firstRequest);
        firstRequest=request;
        return firstRequest;
    }
    public void handleRequest(){
        firstRequest.handleRequest();
    }
}
