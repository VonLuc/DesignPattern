package com.example3;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/11
 * @time: 10:53 上午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class SteamedCrabs extends JLabel implements CrabCooking {
    private static final long serialVersionUID=1L;
    public void CookingMethod()
    {
        this.setIcon(new ImageIcon("src/strategy/SteamedCrabs.jpg"));
        this.setHorizontalAlignment(CENTER);
    }
}
