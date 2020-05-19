package Example1;

/**
 * @description:
 * @author: zhanhongyu@meituan.com
 * @date: 2020/5/19
 * @time: 6:47 下午
 * Copyright (C) 2015 Meituan
 * All rights reserved
 */
public class FarmTest {
    public static void main(String[] args){
        try{
            Farm f;
            Animal a;
            Plant p;
            f=(Farm)ReadXML.getObject();
            a=f.newAnimal();
            p=f.newPlant();
            a.show();
            p.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
