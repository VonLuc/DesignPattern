package com.example2;

/**
 * @description: 调用者
 * @author: VonLuc
 * @date: 2020/9/15
 * @time: 4:11 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class Invoker {
    private Command command;
    public Invoker(Command command) {
        this.command = command;
    }
    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}
