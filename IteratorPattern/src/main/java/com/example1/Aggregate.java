package com.example1;

/**
 * @description: 抽象聚合
 * @author: VonLuc
 * @date: 2020/10/12
 * @time: 1:56 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator getIterator();
}
