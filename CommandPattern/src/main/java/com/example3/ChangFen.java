package com.example3;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/15
 * @time: 4:21 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ChangFen implements Breakfast {
    private ChangFenChef receiver;
    ChangFen() {
        receiver = new ChangFenChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
