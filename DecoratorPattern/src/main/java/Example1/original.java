package Example1;

import javax.swing.*;
import java.awt.*;

/**
 * @description: 具体构件角色：原身
 * @author: VonLuc
 * @date: 2020/9/1
 * @time: 3:18 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class original extends JFrame implements Morrigan {

    private static final long serialVersionUID = 1L;
    private String t="Morrigan0.jpg";
    public original() {
        super("《恶魔战士》中的莫莉卡·安斯兰");
    }
    public void setImage(String t)
    {
        this.t=t;
    }
    @Override
    public void display() {
        this.setLayout(new GridLayout());
        JLabel l1=new JLabel(new ImageIcon("src/decorator/"+t));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
