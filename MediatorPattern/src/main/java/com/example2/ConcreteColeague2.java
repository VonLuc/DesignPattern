package com.example2;

/**
 * @description: 具体同事类2
 * @author: VonLuc
 * @date: 2020/10/13
 * @time: 10:50 上午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ConcreteColeague2 extends Colleague {
    @Override
    public void receive()
    {
        System.out.println("具体同事类2收到请求。");
    }
    @Override
    public void send()
    {
        System.out.println("具体同事类2发出请求。");
        mediator.relay(this);
    }
}
