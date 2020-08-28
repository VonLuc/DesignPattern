package Example3;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/8/28
 * @time: 1:27 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class Test {
    public static void main(String[] args) {
        Adaptee adaptee = new AdapteeRealization();
        Target target = new TwoRealizationAdapter(adaptee);
        target.mubiao();

        target = new TargetRealization();
        adaptee = new TwoRealizationAdapter(target);
        adaptee.beishipei();
    }
}