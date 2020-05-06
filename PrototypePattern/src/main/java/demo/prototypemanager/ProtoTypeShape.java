package demo.prototypemanager;

/**
 * @description:
 * @author: zhanhongyu
 * @date: 2020/5/6
 * @time: 7:18 下午
 * Copyright (C) 2015
 * All rights reserved
 */
public class ProtoTypeShape {
    public static void main(String[] args){
        ProtoTypeManager pm = new ProtoTypeManager();
        Shape obj1 = (Circle)pm.getShape("Circle");
        obj1.countArea();
        Shape obj2 = (Shape)pm.getShape("Square");
        obj2.countArea();
    }
}
