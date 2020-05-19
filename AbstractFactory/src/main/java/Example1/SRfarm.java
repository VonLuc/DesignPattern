package Example1;

/**
 * @description:
 * @author: zhanhongyu
 * @date: 2020/5/19
 * @time: 6:45 下午
 * Copyright (C) 2015
 * All rights reserved
 */
public class SRfarm implements Farm{
    @Override
    public Animal newAnimal()
    {
        System.out.println("新马出生！");
        return new Horse();
    }
    @Override
    public Plant newPlant()
    {
        System.out.println("水果长成！");
        return new Fruitage();
    }
}
