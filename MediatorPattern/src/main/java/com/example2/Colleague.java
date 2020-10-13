package com.example2;

/**
 * @description: 抽象同事类
 * @author: VonLuc
 * @date: 2020/10/13
 * @time: 10:44 上午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
abstract class Colleague {
    protected Mediator mediator;
    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void receive();
    public abstract void send();
}
