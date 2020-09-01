package Example;

/**
 * @description: 具体实现化角色
 * @author: VonLuc
 * @date: 2020/8/31
 * @time: 5:56 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void OperationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}
