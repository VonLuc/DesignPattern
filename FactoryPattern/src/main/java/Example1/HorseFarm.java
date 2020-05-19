package Example1;

/**
 * @description:
 * @author: zhanhongyu
 * @date: 2020/5/19
 * @time: 5:35 下午
 * Copyright (C) 2015
 * All rights reserved
 */
public class HorseFarm implements AnimalFarm{
    @Override
    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }
}
