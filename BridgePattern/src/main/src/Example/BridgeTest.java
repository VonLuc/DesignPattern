package Example;

/**
 * @description: 客户类
 * @author: VonLuc
 * @date: 2020/8/31
 * @time: 5:36 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class BridgeTest {
    public static void main(String[] args) {
        Implementor imple = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(imple);
        abs.Operation();
    }
}
