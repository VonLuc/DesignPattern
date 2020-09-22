package com.examle4;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/22
 * @time: 2:35 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
abstract class HookAbstractClass {
    public void TemplateMethod() {//模版方法
        abstractMethod1();
        HookMethod1();
        if(HookMethod2()) {
            SpecificMethod();
        }
        abstractMethod2();
    }
    public void SpecificMethod() {//具体方法
        System.out.println("抽象类中的具体方法被调用...");
    }

    public void HookMethod1() {}//钩子
    public boolean HookMethod2() {
        return true;
    }

    public abstract void abstractMethod1();//抽象方法1
    public abstract void abstractMethod2();
}
