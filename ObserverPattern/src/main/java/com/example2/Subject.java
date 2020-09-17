package com.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 抽象目标
 * @author: VonLuc
 * @date: 2020/9/17
 * @time: 11:56 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
abstract class Subject {
    protected List<Observer> observers = new ArrayList<Observer>();

    //增加观察者方法
    public void add(Observer observer) {
        observers.add(observer);
    }

    //删除观察者方法
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObserver(); //通知观察者方法
}
