package demo.sanhaoxuesheng;

/**
 * @description:
 * @author: zhanhongyu@meituan.com
 * @date: 2020/5/6
 * @time: 6:03 下午
 * Copyright (C) 2015 Meituan
 * All rights reserved
 */
public class Citation implements Cloneable {
    String name;
    String info;
    String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    void display() {
        System.out.println(name+info+college);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        System.out.println("奖状拷贝成功！");
        return (Citation)super.clone();
    }
}
