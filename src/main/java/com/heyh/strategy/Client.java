package com.heyh.strategy;

public class Client {

    // 来一个上下文环境（这里指存放策略实例的容器）
    private Context context;

    // 执行上下文方法
    public void doSomeing(String type) {
        context = new Context(type);
        context.doSomeing();
    }

}
