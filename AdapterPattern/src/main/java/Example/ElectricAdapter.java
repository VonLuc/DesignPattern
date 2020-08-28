package Example;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/8/28
 * @time: 10:36 上午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class ElectricAdapter implements Motor {
    private ElectricMotor emotor;
    public ElectricAdapter() {
        emotor = new ElectricMotor();
    }
    @Override
    public void drive() {
        emotor.electricDrive();
    }
}
