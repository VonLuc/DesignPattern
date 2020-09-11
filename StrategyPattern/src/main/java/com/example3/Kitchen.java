package com.example3;

import com.example2.Strategy;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/11
 * @time: 10:54 上午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class Kitchen {
    private Strategy strategy;
    public void setStrategy(CrabCooking strategy)
    {
        this.strategy=strategy;
    }
    public CrabCooking getStrategy()
    {
        return strategy;
    }
    public void CookingMethod() {
        strategy.strategyMethod();
    }
}
