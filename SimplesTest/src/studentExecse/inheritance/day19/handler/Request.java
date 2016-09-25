package studentExecse.inheritance.day19.handler;

/**
 * Created by in IntelliJ IDEA.
 * 处理类
 *
 * @author Joney
 * @create 2016-09-19-20:49
 */


public abstract class Request {
    private Request request;
    public abstract void handleRequest();

    public Request getRequest() {
        return request;
    }

    public Request setRequest(Request request){
        this.request=request;
        return this;
    }

}
class XmlHandle extends Request{
    @Override
    public void handleRequest() {
        System.out.println("XmlHandle.handleRequest");
    }
}
class PrintHandle extends Request{
    @Override
    public void handleRequest() {
        System.out.println("PrintHandle.handleRequest");
    }
}
class ControlHandle extends Request{
    @Override
    public void handleRequest() {
        System.out.println("ControlHandle.handleRequest");
    }
}
