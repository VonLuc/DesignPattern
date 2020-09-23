package com.example2;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/23
 * @time: 4:24 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String request) {
        if(request.equals("two"))
        {
            System.out.println("具体处理者2负责处理该请求！");
        }
        else
        {
            if(getNext()!=null)
            {
                getNext().handleRequest(request);
            }
            else
            {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
