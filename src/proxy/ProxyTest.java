package proxy;

public class ProxyTest {
    // spring also use dynamic proxy for interface in AOP
    public static void main(String[] args) {
        TargetService ts = new TargetObject();
        MyInvocationHandler invocationHandler = new MyInvocationHandler(ts);
        TargetService pts = (TargetService) invocationHandler.getProxy();
        // not support self invocation
        pts.doSomething();
    }
}
