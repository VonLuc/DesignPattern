package com.example2;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/18
 * @time: 12:00 上午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ConcreteObserver1 implements Observer {
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}
