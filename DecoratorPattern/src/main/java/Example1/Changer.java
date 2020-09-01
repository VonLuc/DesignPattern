package Example1;

/**
 * @description: 抽象装饰角色：变形
 * @author: VonLuc
 * @date: 2020/9/1
 * @time: 3:21 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class Changer implements Morrigan {
    Morrigan m;
    public Changer(Morrigan m) {
        this.m = m;
    }

    @Override
    public void display() {
        m.display();
    }
}
