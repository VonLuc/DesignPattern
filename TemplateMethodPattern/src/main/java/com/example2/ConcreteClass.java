package com.example2;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/22
 * @time: 1:22 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ConcreteClass extends AbstractClass {
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用...");
    }
    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用...");
    }
}
