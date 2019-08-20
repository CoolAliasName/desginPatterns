package com.heyh.strategy;

/**
 * 具体策略实现类A
 */
public class ConcreteStrategyA implements IStrategy{

    @Override
    public void doSomeing() {
        System.out.println("go to work~");
    }
}
