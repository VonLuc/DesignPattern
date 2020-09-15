package com.example3;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/15
 * @time: 4:22 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class HeFenChef extends JFrame
{
    private static final long serialVersionUID=1L;
    JLabel l=new JLabel();
    HeFenChef()
    {
        super("煮河粉");
        l.setIcon(new ImageIcon("src/command/HeFen.jpg"));
        this.add(l);
        this.setLocation(200, 280);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void cooking()
    {
        this.setVisible(true);
    }
}
