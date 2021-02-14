package com.formula.summer.patterns.proxy;

public class ServiceImpl implements Service {
    @Override
    public String job() {
        System.out.println("Doing Job");
        return "OK";
    }
}
