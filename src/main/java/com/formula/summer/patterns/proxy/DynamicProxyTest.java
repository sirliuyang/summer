package com.formula.summer.patterns.proxy;

import java.lang.reflect.Proxy;

//https://www.liaoxuefeng.com/wiki/1252599548343744/1264804593397984
public class DynamicProxyTest {
    public static void main(String[] args) {
        Service serviceImpl = new ServiceImpl();
        Service proxy = (Service) Proxy.newProxyInstance(Service.class.getClassLoader(), new Class[]{Service.class},
                new DynamicProxy(serviceImpl));
        proxy.job();
    }
}
