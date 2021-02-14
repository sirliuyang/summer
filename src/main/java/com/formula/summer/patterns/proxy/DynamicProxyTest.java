package com.formula.summer.patterns.proxy;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args) {
        Service serviceImpl = new ServiceImpl();
        Service proxy = (Service) Proxy.newProxyInstance(Service.class.getClassLoader(), new Class[]{Service.class},
                new DynamicProxy(serviceImpl));
        proxy.job();
    }
}
