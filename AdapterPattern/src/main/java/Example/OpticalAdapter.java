package Example;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/8/28
 * @time: 10:38 上午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class OpticalAdapter implements Motor {
    private OpticalMotor omotor;
    public OpticalAdapter() {
        omotor = new OpticalMotor();
    }
    @Override
    public void drive() {
        omotor.opticalDrive();
    }
}
