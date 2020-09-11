package com.example2;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/11
 * @time: 10:22 上午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class StrategyPattern {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("------------------");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}
