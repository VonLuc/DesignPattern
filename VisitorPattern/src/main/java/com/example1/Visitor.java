package com.example1;

/**
 * @description: 抽象访问者
 * @author: VonLuc
 * @date: 2020/10/18
 * @time: 12:29 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public interface Visitor {
    void visit(ConcreteElementA concreteElementA);
    void visit(ConcreteElementB concreteElementB);
}
