package Example1;

/**
 * @description:
 * @author: zhanhongyu
 * @date: 2020/5/19
 * @time: 6:44 下午
 * Copyright (C) 2015
 * All rights reserved
 */
public class SGfarm implements Farm{
    @Override
    public Animal newAnimal(){
        System.out.println("新牛出生！");
        return new Cattle();
    }
    @Override
    public Plant newPlant()
    {
        System.out.println("蔬菜长成！");
        return new Vegetables();
    }
}
