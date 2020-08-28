package Example3;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/8/28
 * @time: 1:13 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class AdapteeRealization implements Adaptee {
    @Override
    public void beishipei() {
        System.out.println("适配者代码被调用");
    }
}
