package com.example1;

/**
 * @description: 抽象聚合和抽象迭代器为接口，具体聚合实现抽象聚合，实现抽象聚合中的聚合类增删获取迭代器方法。具体迭代器实现抽象迭代器，具体实现对聚合类的遍历记录操作
 * @author: VonLuc
 * @date: 2020/10/12
 * @time: 1:56 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class IteratorPattern {
    public static void main(String[] args) {
        Aggregate ag = new ConcreteAggregate();
        ag.add("1");
        ag.add("2");
        ag.add("3");
        System.out.println("聚合的内容有：");
        Iterator it = ag.getIterator();
        while (it.hasNext()) {
            Object ob = it.next();
            System.out.print(ob.toString()+"\t");
        }
        Object ob=it.first();
        System.out.println("\nFirst："+ob.toString());
    }
}
