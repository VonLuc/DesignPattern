package demo.sunwukong;

import javax.swing.*;

/**
 * @description:
 * @author: zhanhongyu
 * @date: 2020/5/6
 * @time: 12:12 下午
 * Copyright (C) 2015
 * All rights reserved
 */
public class SunWuKong extends JPanel implements Cloneable {

    private static final long serialVersionUID = 5543049531872119328L;

    public SunWuKong() {
//        JLabel l1 = new JLabel(new ImageIcon("/Users/zhanhongyu/Documents/GitHub/DesignPattern/PrototypePattern/src/main/resources/Wukong.jpg"));
        JLabel l1 = new JLabel(new ImageIcon("src/main/resources/Wukong.jpg"));
        this.add(l1);
    }

    @Override
    public Object clone(){
        SunWuKong w = null;
        try{
            w = (SunWuKong) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("拷贝悟空失败！");
        }
        return w;
    }
}
