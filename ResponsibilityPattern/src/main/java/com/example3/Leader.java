package com.example3;

/**
 * @description: 领导类
 * @author: VonLuc
 * @date: 2020/9/23
 * @time: 4:35 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
abstract class Leader {
    private Leader next;

    public void setNext(Leader next) {
        this.next = next;
    }

    public Leader getNext() {
        return next;
    }

    public abstract void handleRequest(int leaveDays);
}
