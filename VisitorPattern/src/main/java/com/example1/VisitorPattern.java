package com.example1;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/10/18
 * @time: 12:29 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class VisitorPattern {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        Visitor visitor = new ConcreteVisitorA();
        os.accept(visitor);
        System.out.println(".........");
        visitor = new ConcreteVisitorB();
        os.accept(visitor);
    }
}
