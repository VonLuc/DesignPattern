package Example1;

import javax.swing.*;
import java.awt.*;

/**
 * @description:
 * @author: zhanhongyu
 * @date: 2020/5/19
 * @time: 6:33 下午
 * Copyright (C) 2015
 * All rights reserved
 */
public class Horse implements Animal{
    JScrollPane sp;
    JFrame jf=new JFrame("抽象工厂模式测试");
    public Horse(){
        Container contentPane=jf.getContentPane();
        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(1,1));
        p1.setBorder(BorderFactory.createTitledBorder("动物：马"));
        sp=new JScrollPane(p1);
        contentPane.add(sp, BorderLayout.CENTER);
        JLabel l1=new JLabel(new ImageIcon("src/A_Horse.jpg"));
        p1.add(l1);
        jf.pack();
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//用户点击窗口关闭
    }
    @Override
    public void show(){
        jf.setVisible(true);
    }
}
