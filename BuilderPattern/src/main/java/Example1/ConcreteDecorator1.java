package Example1;

/**
 * @description:具体建造者：具体装修工人1
 * @author: zhanhongyu
 * @date: 2020/5/21
 * @time: 11:52 上午
 * Copyright (C) 2015
 * All rights reserved
 */
public class ConcreteDecorator1 extends Decorator{
    @Override
    public void buildWall() {
        product.setWall("w1");
    }

    @Override
    public void buildTV() {
        product.setTV("tv1");
    }

    @Override
    public void buildSofa() {
        product.setSofa("sf1");
    }
}
