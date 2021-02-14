package com.formula.summer.patterns.proxy;

/**
 * 优点：可以做到在符合开闭原则的情况下对目标对象进行功能扩展。
 * 缺点：我们得为每一个服务都得创建代理类，工作量太大，不易管理。同时接口一旦发生改变，代理类也得相应修改。
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Service serviceImpl = new ServiceImpl();
        StaticProxy staticProxy = new StaticProxy(serviceImpl);
        staticProxy.job();
    }
}
