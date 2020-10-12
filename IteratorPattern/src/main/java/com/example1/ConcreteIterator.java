package com.example1;

import java.util.List;

/**
 * @description: 具体迭代器
 * @author: VonLuc
 * @date: 2020/10/12
 * @time: 2:36 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ConcreteIterator implements Iterator {
    private List<Object> list = null;
    private int index = -1;
    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if(index < list.size()-1) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Object first() {
        index = 0;
        return list.get(index);
    }

    @Override
    public Object next() {
        Object obj = null;
        if(this.hasNext()){
            obj = list.get(++index);
        }
        return obj;
    }
}
