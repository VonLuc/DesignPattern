package com.example3;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/15
 * @time: 4:27 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class Waiter {
    private Breakfast changFen, hunTun, heFen;

    public void setChangFen(Breakfast changFen) {
        this.changFen = changFen;
    }

    public void setHeFen(Breakfast heFen) {
        this.heFen = heFen;
    }

    public void setHunTun(Breakfast hunTun) {
        this.hunTun = hunTun;
    }

    public void chooseChangFen() {
        changFen.cooking();
    }

    public void chooseHunTun() {
        hunTun.cooking();
    }

    public  void chooseHeFen() {
        heFen.cooking();
    }
}
