package Example;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/1
 * @time: 2:30 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("-----------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}
