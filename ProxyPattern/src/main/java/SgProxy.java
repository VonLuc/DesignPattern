/**
 * @description:
 * @author: zhanhongyu
 * @date: 2020/5/28
 * @time: 11:26 上午
 * Copyright (C) 2015
 * All rights reserved
 */
public class SgProxy implements Specialty{
    private WySpecialty realSubject = new WySpecialty();

    @Override
    public void display() {
        preRequest();
        realSubject.display();
        postRequest();
    }
    public void preRequest(){
        System.out.println("韶关代理婺源特产开始。");
    }
    public void postRequest(){
        System.out.println("韶关代理婺源特产结束。");
    }
}
