package Example;

/**
 * @description: 抽象化角色
 * @author: VonLuc
 * @date: 2020/8/31
 * @time: 6:01 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
abstract class Abstraction {
    /**对实现化对象的引用 **/
    protected Implementor imple;

    protected Abstraction(Implementor imple) {
        this.imple = imple;
    }
    public abstract void Operation();
}
