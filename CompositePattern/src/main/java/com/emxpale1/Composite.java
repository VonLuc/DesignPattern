package com.emxpale1;

import java.util.ArrayList;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/2
 * @time: 4:20 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class Composite implements Component {
    private ArrayList<Component> children = new ArrayList<Component>();
    public void add(Component c)
    {
        children.add(c);
    }
    public void remove(Component c)
    {
        children.remove(c);
    }
    public Component getChild(int i)
    {
        return children.get(i);
    }
    public void operation()
    {
        for(Object obj:children)
        {
            ((Component)obj).operation();
        }
    }
}
