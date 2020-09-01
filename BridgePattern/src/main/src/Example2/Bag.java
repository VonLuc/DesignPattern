package Example2;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/1
 * @time: 10:48 上午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
abstract class Bag {
    protected Color color;
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     *
     * @return
     */
    public abstract String getName();
}
