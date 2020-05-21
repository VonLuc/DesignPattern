package Example1;

import com.sun.deploy.util.StringUtils;

/**
 * @description:抽象建造者：装修工人
 * @author: zhanhongyu
 * @date: 2020/5/21
 * @time: 11:49 上午
 * Copyright (C) 2015
 * All rights reserved
 */
abstract class Decorator {
    //创建产品对象
    protected Parlour product = new Parlour();
    //返回产品对象
    public Parlour getResult(){
        return product;
    }
    public abstract void buildWall();
    public abstract void buildTV();
    public abstract void buildSofa();
}
