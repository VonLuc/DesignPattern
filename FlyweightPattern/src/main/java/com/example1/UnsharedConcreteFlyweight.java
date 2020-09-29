package com.example1;

/**
 * @description: 非享元角色
 * @author: VonLuc
 * @date: 2020/9/29
 * @time: 4:45 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class UnsharedConcreteFlyweight {
    private String info;
    UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
