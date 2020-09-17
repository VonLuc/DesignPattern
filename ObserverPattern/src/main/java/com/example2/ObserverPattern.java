package com.example2;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/17
 * @time: 11:56 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject=new ConcreteSubject();
        Observer obs1=new ConcreteObserver1();
        Observer obs2=new ConcreteObserver2();
        subject.add(obs1);
        subject.add(obs2);
        subject.notifyObserver();
    }
}
