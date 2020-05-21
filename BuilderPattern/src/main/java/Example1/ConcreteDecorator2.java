package Example1;

/**
 * @description:具体建造者：具体装修工人2
 * @author: zhanhongyu
 * @date: 2020/5/21
 * @time: 11:54 上午
 * Copyright (C) 2015
 * All rights reserved
 */
public class ConcreteDecorator2 extends Decorator{
    @Override
    public void buildWall() {
        product.setWall("w2");
    }

    @Override
    public void buildTV() {
        product.setTV("TV2");
    }

    @Override
    public void buildSofa() {
        product.setSofa("sf2");
    }
}
