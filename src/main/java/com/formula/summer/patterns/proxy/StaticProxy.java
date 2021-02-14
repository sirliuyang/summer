package com.formula.summer.patterns.proxy;

public class StaticProxy implements Service {

    private final Service service;

    public StaticProxy(Service serviceImpl) {
        service = serviceImpl;
    }

    @Override
    public String job() {
        System.out.println("Static Proxy");
        return service.job();
    }
}
