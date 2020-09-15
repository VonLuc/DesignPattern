package com.exaple3;

/**
 * @description: 具体命令1
 * @author: VonLuc
 * @date: 2020/9/15
 * @time: 10:43 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ConcreteCommand1 implements AabstractCommand {
    private CompositeReveiver compositeReveiver;
    ConcreteCommand1() {
        compositeReveiver = new CompositeReveiver();
    }

    @Override
    public void execute() {
        compositeReveiver.action1();
    }
}
