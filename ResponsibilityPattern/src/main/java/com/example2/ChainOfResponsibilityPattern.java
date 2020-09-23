package com.example2;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/23
 * @time: 4:21 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        handler1.handleRequest("two");
    }
}
