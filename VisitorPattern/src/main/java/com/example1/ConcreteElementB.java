package com.example1;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/10/18
 * @time: 12:34 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "B's";
    }
}
