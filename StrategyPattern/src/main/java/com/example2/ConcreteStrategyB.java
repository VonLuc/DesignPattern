package com.example2;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/11
 * @time: 10:20 上午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ConcreteStrategyB implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
