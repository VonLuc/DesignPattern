package com.example2;

/**
 * @description: 抽象处理者角色
 * @author: VonLuc
 * @date: 2020/9/23
 * @time: 4:21 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
 abstract class Handler {
     //后继连接
     private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }
    //处理请求的抽象方法
    public abstract void handleRequest(String request);
}
