package com.emxpale1;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/2
 * @time: 4:18 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }
    public void add(Component c){ }
    public void remove(Component c){ }
    public Component getChild(int i)
    {
        return null;
    }
    public void operation()
    {
        System.out.println("树叶"+name+"：被访问！");
    }
}
