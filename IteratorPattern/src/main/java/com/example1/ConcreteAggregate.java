package com.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 具体聚合类
 * @author: VonLuc
 * @date: 2020/10/12
 * @time: 1:58 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> list = new ArrayList<Object>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
