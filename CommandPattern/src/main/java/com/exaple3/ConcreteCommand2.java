package com.exaple3;

/**
 * @description: 具体命令2
 * @author: VonLuc
 * @date: 2020/9/15
 * @time: 10:48 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ConcreteCommand2 implements AabstractCommand {
    private CompositeReveiver reveiver;
    ConcreteCommand2(CompositeReveiver reveiver) {
        reveiver = new CompositeReveiver();
    }

    @Override
    public void execute() {
        reveiver.action2();
    }
}
