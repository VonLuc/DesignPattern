package Example2;

/**
 * @description:双向适配器测试
 * @author: VonLuc
 * @date: 2020/8/28
 * @time: 11:08 上午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class TwoWayAdapterTest {
    public static void main(String[] args) {
        System.out.println("目标通过双向适配器访问适配者");
        TwoWayAdaptee adaptee = new AdapteeRealize();
        TwoWayTarget target = new TwoWayAdapter(adaptee);
        target.request();
        System.out.println("-------------------");
        System.out.println("适配者通过双向适配器访问目标：");
        target = new TargetRealize();
        adaptee = new TwoWayAdapter(target);
        adaptee.specificRequest();
    }
}
