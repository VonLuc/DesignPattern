package com.example3;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/15
 * @time: 4:21 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ChangFenChef  extends JFrame {
    private static final long serialVersionUID = 1L;
    JLabel l=new JLabel();
    ChangFenChef()
    {
        super("煮肠粉");
        l.setIcon(new ImageIcon("src/command/ChangFen.jpg"));
        this.add(l);
        this.setLocation(30, 30);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void cooking()
    {
        this.setVisible(true);
    }
}
