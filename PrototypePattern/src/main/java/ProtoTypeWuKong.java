import netscape.security.UserTarget;

import javax.swing.*;
import java.awt.*;

/**
 * @description:
 * @author: zhanhongyu
 * @date: 2020/5/6
 * @time: 12:17 下午
 * Copyright (C) 2015
 * All rights reserved
 */
public class ProtoTypeWuKong {
    public static void main(String[] args){
        JFrame jf = new JFrame("原型模式测试");
        jf.setLayout(new GridLayout(1,2));
        Container contentPane = jf.getContentPane();
        SunWuKong obj1 = new SunWuKong();
        contentPane.add(obj1);
        SunWuKong obj2 = (SunWuKong)obj1.clone();
        contentPane.add(obj2);
        jf.pack();;
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
