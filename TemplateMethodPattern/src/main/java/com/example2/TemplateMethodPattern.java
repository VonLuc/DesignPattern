package com.example2;

/**
 * @description: 模版模式测试
 * @author: VonLuc
 * @date: 2020/9/22
 * @time: 1:19 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class TemplateMethodPattern {
    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.TemplateMethod();
    }
}
