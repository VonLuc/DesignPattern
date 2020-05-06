package demo.prototypemanager;

/**
 * @description:
 * @author: zhanhongyu
 * @date: 2020/5/6
 * @time: 6:59 下午
 * Copyright (C) 2015
 * All rights reserved
 */
public interface Shape extends Cloneable{
    public Object clone();
    public void countArea();
}
