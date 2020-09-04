package com.emxpale1;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/2
 * @time: 4:17 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public interface Component {
    public void add(Component c);
    public void remove(Component c);
    public Component getChild(int i);
    public void operation();
}
