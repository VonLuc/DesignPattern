package com.example2;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/11
 * @time: 10:21 上午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
