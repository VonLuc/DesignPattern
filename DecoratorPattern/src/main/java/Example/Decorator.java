package Example;

/**
 * @description: 抽象装饰角色
 * @author: VonLuc
 * @date: 2020/9/1
 * @time: 2:38 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class Decorator implements Component {
    /*** 具体构件的实例 ***/
    private Component component;
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
