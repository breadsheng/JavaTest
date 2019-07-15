package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {

    private Object proxyObj;

    public MyInvocationHandler(Object proxyObj) {
        this.proxyObj = proxyObj;
    }

    Object getProxy() {
        Object realObj = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), proxyObj.getClass().getInterfaces(), this);
        return realObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass().getName());
        System.out.println("before");
        Object result = method.invoke(proxyObj, args);
        System.out.println("after");
        return result;
    }
}