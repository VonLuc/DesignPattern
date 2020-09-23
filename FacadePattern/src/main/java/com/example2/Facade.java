package com.example2;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/23
 * @time: 4:47 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class Facade {
    private SubSystem01 obj1 = new SubSystem01();
    private SubSystem02 obj2 = new SubSystem02();
    private SubSystem03 obj3 = new SubSystem03();
    public void method() {
        obj1.method1();
        obj2.method2();
        obj3.method3();
    }
}
