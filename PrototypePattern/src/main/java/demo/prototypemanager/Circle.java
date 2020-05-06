package demo.prototypemanager;

import java.util.Scanner;

/**
 * @description:
 * @author: zhanhongyu
 * @date: 2020/5/6
 * @time: 7:01 下午
 * Copyright (C) 2015
 * All rights reserved
 */
public class Circle implements Shape{
    @Override
    public Object clone() {
        Circle w = null;
        try {
            w = (Circle)super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("拷贝圆失败！");
        }
        return w;
    }

    @Override
    public void countArea(){
        int r = 0;
        System.out.println("这是一个圆，请输入半径:");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        System.out.println("该圆的面积=" + 3.1415*r*r + "\n");
    }
}
