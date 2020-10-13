package com.example2;

/**
 * @description: 抽象中介者
 * @author: VonLuc
 * @date: 2020/10/13
 * @time: 10:42 上午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
abstract class Mediator {
    public abstract void register(Colleague colleague);
    //转发
    public abstract void relay(Colleague cl);
}
