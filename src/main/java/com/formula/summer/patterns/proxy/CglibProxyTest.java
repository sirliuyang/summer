package com.formula.summer.patterns.proxy;

public class CglibProxyTest {
    public static void main(String[] args) {
        Service serviceImpl = new ServiceImpl();
        CglibProxy proxy = new CglibProxy();
        ServiceImpl serviceProxy = (ServiceImpl) proxy.getInstance(serviceImpl);
        serviceProxy.job();
    }
}
