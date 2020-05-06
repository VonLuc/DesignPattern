package demo.prototypemanager;

import java.util.HashMap;

/**
 * @description:
 * @author: zhanhongyu
 * @date: 2020/5/6
 * @time: 7:15 下午
 * Copyright (C) 2015
 * All rights reserved
 */
public class ProtoTypeManager {
    private HashMap<String, Shape> ht = new HashMap<String, Shape>();
    public ProtoTypeManager(){
        ht.put("Circle", new Circle());
        ht.put("Square", new Square());
    }
    public void addShape(String key, Shape obj){
        ht.put(key, obj);
    }
    public Shape getShape(String key){
        Shape temp = ht.get(key);
        return (Shape)temp.clone();
    }
}
