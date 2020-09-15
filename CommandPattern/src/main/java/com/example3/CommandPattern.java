package com.example3;
//客户去餐馆可选择的早餐有肠粉、河粉和馄饨等，客户可向服务员选择以上早餐中的若干种，
// 服务员将客户的请求交给相关的厨师去做。这里的点早餐相当于“命令”，服务员相当于“调用者”，
// 厨师相当于“接收者”，所以用命令模式实现比较合适。首先，定义一个早餐类（Breakfast），它是抽象命令类，有抽象方法 cooking()，
//说明要做什么；再定义其子类肠粉类（ChangFen）、馄饨类（HunTun）和河粉类（HeFen），
// 它们是具体命令类，实现早餐类的 cooking() 方法，但它们不会具体做，而是交给具体的厨师去做；
// 具体厨师类有肠粉厨师（ChangFenChef）、馄蚀厨师（HunTunChef）和河粉厨师（HeFenChef），他们是命令的接收者
/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/15
 * @time: 4:30 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class CommandPattern {
    public static void main(String[] args) {
        Breakfast food1=new ChangFen();
        Breakfast food2=new HunTun();
        Breakfast food3=new HeFen();
        Waiter fwy=new Waiter();
        fwy.setChangFen(food1);//设置肠粉菜单
        fwy.setHunTun(food2);  //设置河粉菜单
        fwy.setHeFen(food3);   //设置馄饨菜单
        fwy.chooseChangFen();  //选择肠粉
        fwy.chooseHeFen();     //选择河粉
        fwy.chooseHunTun();    //选择馄饨
    }
}
