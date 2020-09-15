package com.exaple3;

import java.util.ArrayList;

/**
 * @description: 树枝构件：调用者
 * @author: VonLuc
 * @date: 2020/9/15
 * @time: 10:50 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class CompositeInvoker implements AabstractCommand {
    private ArrayList<AabstractCommand> children = new ArrayList<AabstractCommand>();
    public void add(AabstractCommand c) {
        children.add(c);
    }
    public void remove(AabstractCommand c) {
        children.remove(c);
    }
    public AabstractCommand getChild(int i ) {
        return children.get(i);
    }
    @Override
    public void execute() {
        for (Object obj:children) {
            ((AabstractCommand)obj).execute();
        }
    }
}