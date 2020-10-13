package com.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 具体中介者
 * @author: VonLuc
 * @date: 2020/10/13
 * @time: 10:45 上午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues = new ArrayList<Colleague>();

    @Override
    public void register(Colleague colleague) {
        if(!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    public void relay(Colleague cl) {
        for(Colleague ob:colleagues) {
            if(!ob.equals(cl)) {
                ((Colleague)ob).receive();
            }
        }
    }
}
