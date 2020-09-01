package Example;

/**
 * @description: 扩展抽象化角色
 * @author: VonLuc
 * @date: 2020/8/31
 * @time: 6:03 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class RefinedAbstraction extends  Abstraction {
    protected RefinedAbstraction(Implementor imple) {
        super(imple);
    }

    /**
    实现抽象父类的业务方法
     */
    @Override
    public void Operation() {
        System.out.println("扩展抽象化（Refined Abstraction)角色被访问");
        //此处为组合关系调用，调用抽象父类中实现化角色的业务方法
        imple.OperationImpl();
    }
}
