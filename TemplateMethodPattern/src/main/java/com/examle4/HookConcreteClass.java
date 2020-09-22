package com.examle4;

/**
 * @description: 含钩子方法的具体子类
 * @author: VonLuc
 * @date: 2020/9/22
 * @time: 2:41 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class HookConcreteClass extends HookAbstractClass {
    public void abstractMethod1()
    {
        System.out.println("抽象方法1的实现被调用...");
    }
    public void abstractMethod2()
    {
        System.out.println("抽象方法2的实现被调用...");
    }
    public void HookMethod1()
    {
        System.out.println("钩子方法1被重写...");
    }
    public boolean HookMethod2()
    {
        return false;
    }
}
