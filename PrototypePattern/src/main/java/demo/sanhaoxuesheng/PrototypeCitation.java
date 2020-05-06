package demo.sanhaoxuesheng;

/**
 * @description:
 * @author: zhanhongyu
 * @date: 2020/5/6
 * @time: 6:01 下午
 * Copyright (C) 2015
 * All rights reserved
 * problem：同一个学校的三好学生奖状除了获奖人名字不同，其他都相同，属于类似的对象的复制，用原型模式创建，然后做简单的修改
 */
public class PrototypeCitation {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation obj1 = new Citation("张三","同学：在2020学年第一学期中表现优秀，被评为三好学生。","韶关学院");
        obj1.display();
        Citation obj2 = (Citation) obj1.clone();
        obj2.setName("李四");
        obj2.display();
    }
}
