package com.example2;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/23
 * @time: 4:46 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class FacadePattern {
    public static void main(String[] args) {
        Facade f  = new Facade();
        f.method();
        System.out.println("");
    }
}
