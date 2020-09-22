package com.example2;

/**
 * @description: 抽象类
 * @author: VonLuc
 * @date: 2020/9/22
 * @time: 1:20 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
abstract class AbstractClass {
    public void TemplateMethod() {//模版方法
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }
    public void SpecificMethod() {//具体方法
        System.out.println("抽象类中的具体方法被调用...");
    }
    //抽象方法
    public abstract void abstractMethod1();
    public abstract void abstractMethod2();
}
