package Example;

/**
 * @description: 具体装饰角色
 * @author: VonLuc
 * @date: 2020/9/1
 * @time: 2:40 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
class ConcreteDecorator extends Decorator {

    /*** 构造器，使用父类的构造函数初始化实例对象 ***/
    public ConcreteDecorator(Component component) {
        super(component);
    }

    /**
     * 继承并实现抽象装饰类的方法并扩展添加额外功能
     */
    @Override
    public void operation() {
        super.operation();
        addFunction();
    }

    public void addFunction() {
        System.out.println("为具体构件角色增加额外的功能addFunction（)");
    }
}
