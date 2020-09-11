package com.example2;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/11
 * @time: 10:19 上午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}
