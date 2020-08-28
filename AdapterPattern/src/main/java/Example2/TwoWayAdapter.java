package Example2;

/**
 * @description:双向适配器
 * @author: VonLuc
 * @date: 2020/8/28
 * @time: 11:13 上午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class TwoWayAdapter implements TwoWayAdaptee, TwoWayTarget {
    private TwoWayTarget target;
    private TwoWayAdaptee adaptee;

    public TwoWayAdapter(TwoWayTarget target) {
        this.target = target;
    }
    public TwoWayAdapter(TwoWayAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }

    @Override
    public void specificRequest() {
        target.request();
    }
}
