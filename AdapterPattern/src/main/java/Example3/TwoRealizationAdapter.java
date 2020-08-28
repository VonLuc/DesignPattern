package Example3;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/8/28
 * @time: 1:17 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class TwoRealizationAdapter implements Adaptee, Target {

    private Adaptee adaptee;
    private Target target;

    public TwoRealizationAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public TwoRealizationAdapter(Target target){
        this.target = target;
    }
    @Override
    public void mubiao() {
        adaptee.beishipei();
    }

    @Override
    public void beishipei() {
        target.mubiao();
    }
}
