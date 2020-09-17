package com.example2;

/**
 * @description: 具体目标
 * @author: VonLuc
 * @date: 2020/9/17
 * @time: 11:58 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ConcreteSubject extends Subject {
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");

        for (Object obs : observers) {
            ((Observer) obs).response();
        }

    }
}