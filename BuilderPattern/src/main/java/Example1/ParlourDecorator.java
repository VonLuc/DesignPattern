package Example1;

/**
 * @description:
 * @author: zhanhongyu
 * @date: 2020/5/21
 * @time: 11:40 上午
 * Copyright (C) 2015
 * All rights reserved
 */
public class ParlourDecorator {
    public static void main(String[] args) {
        try{
            Decorator d;
            d = (Decorator)ReadXML.getObject();
            ProjectManager m = new ProjectManager(d);
            Parlour p = m.decorate();
            p.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}