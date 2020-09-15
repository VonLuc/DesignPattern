package com.example2;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/15
 * @time: 4:14 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class CommandPatter {
    public static void main(String[] args) {
        Command cmd = new ConcreteComman();
        Invoker ir = new Invoker(cmd);
        System.out.println("客户访问调用者的call()方法...");
        ir.call();
    }
}
