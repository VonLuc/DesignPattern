package com.example1;

/**
 * @description: 抽象享元角色
 * @author: VonLuc
 * @date: 2020/9/29
 * @time: 4:46 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public interface Flyweight {
    public void operation(UnsharedConcreteFlyweight state);
}
