package com.formula.summer.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//https://www.jianshu.com/p/471c80a7e831
public class DynamicProxy implements InvocationHandler {

    private final Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Dynamic Proxy");
        return method.invoke(object, args);
    }
}
