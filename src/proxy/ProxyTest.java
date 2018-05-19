package proxy;

public class ProxyTest {
    public static void main(String[] args) {
        TargetService ts = new TargetObject();
        MyInvocationHandler invocationHandler = new MyInvocationHandler(ts);
        TargetService pts = (TargetService) invocationHandler.getProxy();
        // not support self invocation
        pts.doSomething();
    }
}
