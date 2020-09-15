package com.example2;

/**
 * @description: 具体命令
 * @author: VonLuc
 * @date: 2020/9/15
 * @time: 4:08 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ConcreteComman implements Command {
    private Receiver receiver;
    ConcreteComman() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
