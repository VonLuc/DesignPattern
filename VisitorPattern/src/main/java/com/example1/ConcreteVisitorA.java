package com.example1;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/10/18
 * @time: 12:31 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ConcreteVisitorA implements Visitor {
    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("具体访问者A访问-->" + concreteElementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println("具体访问者A访问-->" + concreteElementB.operationB());
    }
}
