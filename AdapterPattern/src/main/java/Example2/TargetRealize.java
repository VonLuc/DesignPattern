package Example2;

/**
 * @description:目标实现
 * @author: VonLuc
 * @date: 2020/8/28
 * @time: 11:11 上午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class TargetRealize implements TwoWayTarget {
    @Override
    public void request() {
        System.out.println("目标代码被调用");
    }
}
