package com.formula.summer.patterns.proxy.stat1c;

public class StaticProxy implements StaticService {

    private StaticService service;

    public StaticProxy() {
        service = new StaticServiceImpl();
    }

    @Override
    public String job() {
        return service.job();
    }
}
