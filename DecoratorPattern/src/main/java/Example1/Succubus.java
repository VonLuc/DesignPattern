package Example1;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/1
 * @time: 3:25 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class Succubus extends Changer {
    public Succubus(Morrigan m) {
        super(m);
    }

    @Override
    public void display() {
        setChanger();
        super.display();
    }

    public void setChanger()
    {
        ((original) super.m).setImage("Morrigan1.jpg");
    }
}
