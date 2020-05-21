package Example1;

import javax.swing.*;
import java.awt.*;

/**
 * @description:产品：客厅
 * @author: zhanhongyu
 * @date: 2020/5/21
 * @time: 11:43 上午
 * Copyright (C) 2015
 * All rights reserved
 */
public class Parlour {
    private String wall;
    private String TV;
    private String sofa;

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getTV() {
        return TV;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }

    public String getSofa() {
        return sofa;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    public void show() {
        JFrame jf = new JFrame("建造者模式测试");
        Container contentPane = jf.getContentPane();
        JPanel p = new JPanel();
        JScrollPane sp = new JScrollPane(p);
        String parlour = wall+TV+sofa;
        JLabel l = new JLabel(new ImageIcon("src/"+parlour+".jpg"));
        p.setLayout(new GridLayout(1,1));
        p.setBorder(BorderFactory.createTitledBorder("客厅"));
        p.add(l);
        contentPane.add(sp,BorderLayout.CENTER);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
