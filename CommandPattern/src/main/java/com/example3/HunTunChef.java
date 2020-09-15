package com.example3;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/15
 * @time: 4:22 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class HunTunChef extends JFrame
{
    private static final long serialVersionUID=1L;
    JLabel l=new JLabel();
    HunTunChef()
    {
        super("煮馄饨");
        l.setIcon(new ImageIcon("src/command/HunTun.jpg"));
        this.add(l);
        this.setLocation(350, 50);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void cooking()
    {
        this.setVisible(true);
    }
}
