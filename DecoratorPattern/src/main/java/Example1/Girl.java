package Example1;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/1
 * @time: 3:26 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class Girl extends Changer {
    public Girl(Morrigan m)
    {
        super(m);
    }
    public void display()
    {
        setChanger();
        super.display();
    }
    public void setChanger()
    {
        ((original) super.m).setImage("Morrigan2.jpg");
    }
}
