package com.example3;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/15
 * @time: 4:26 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class HeFen implements Breakfast {
    private HeFenChef receiver;
    HeFen() {
        receiver = new HeFenChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
