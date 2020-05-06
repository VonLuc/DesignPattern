package demo.prototypemanager;

import java.util.Scanner;

/**
 * @description:
 * @author: zhanhongyu
 * @date: 2020/5/6
 * @time: 7:11 下午
 * Copyright (C) 2015
 * All rights reserved
 */
public class Square implements Shape{
    @Override
    public Object clone()
    {
        Square b=null;
        try
        {
            b=(Square)super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("拷贝正方形失败!");
        }
        return b;
    }

    @Override
    public void countArea()
    {
        int a=0;
        System.out.print("这是一个正方形，请输入它的边长：");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        System.out.println("该正方形的面积="+a*a+"\n");
    }
}
