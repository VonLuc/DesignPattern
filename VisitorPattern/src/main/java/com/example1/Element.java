package com.example1;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/10/18
 * @time: 12:32 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public interface Element {
    void accept(Visitor visitor);
}