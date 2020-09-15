package com.example3;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/15
 * @time: 4:24 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class HunTun implements Breakfast {
    private HunTunChef receiver;
    public HunTun() {
        receiver = new HunTunChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
