package com.formula.summer.patterns.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//https://www.jianshu.com/p/9a61af393e41?from=timeline&isappinstalled=0
public class CglibProxy implements MethodInterceptor {

    public Object getInstance(final Object target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib Proxy");
        return methodProxy.invoke(o, objects);
    }
}
