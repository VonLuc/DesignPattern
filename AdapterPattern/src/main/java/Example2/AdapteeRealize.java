package Example2;

/**
 * @description:适配者实现
 * @author: VonLuc
 * @date: 2020/8/28
 * @time: 11:12 上午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class AdapteeRealize implements TwoWayAdaptee {
    @Override
    public void specificRequest() {
        System.out.println("适配者代码被调用");
    }
}
