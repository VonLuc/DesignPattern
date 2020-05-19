package Example1;

/**
 * @description:
 * @author: zhanhongyu
 * @date: 2020/5/19
 * @time: 5:37 下午
 * Copyright (C) 2015 Meituan
 * All rights reserved
 */
public class CattleFarm implements AnimalFarm{
    @Override
    public Animal newAnimal(){
        System.out.println("新牛出生！");
        return new Cattle();
    }
}
