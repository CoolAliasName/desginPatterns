package com.heyh.strategy;

/**
 * 上下文环境
 */
public class Context {

    private IStrategy strategy;

    // 利用工厂模式将策略实现类的创建交由上下文控制。
    public Context(String type) {
        if("A".equals(type)) {
            strategy = new ConcreteStrategyA();
        }
        if ("B".equals(type)) {
            strategy = new ConcreteStrategyB();
        }
    }

    public void doSomeing() {
        strategy.doSomeing();
    }

}
