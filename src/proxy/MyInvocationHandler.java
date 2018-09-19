package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {

    private TargetService targetService;

    public MyInvocationHandler(TargetService targetService) {
        this.targetService = targetService;
    }

    Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), targetService.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass().getName());
        System.out.println("before");
        Object result = method.invoke(targetService, args);
        System.out.println("after");
        return result;
    }
}