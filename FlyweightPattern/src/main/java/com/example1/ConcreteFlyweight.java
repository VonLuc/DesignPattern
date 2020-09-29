package com.example1;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/29
 * @time: 4:47 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ConcreteFlyweight implements Flyweight {
    private String key;
    ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元"+key+"被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight outState) {
        System.out.print("具体享元"+key+"被调用，");
        System.out.println("非享元信息是:"+outState.getInfo());
    }
}
