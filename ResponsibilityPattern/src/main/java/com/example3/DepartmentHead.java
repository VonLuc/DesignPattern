package com.example3;

/**
 * @description:
 * @author: VonLuc
 * @date: 2020/9/23
 * @time: 4:38 下午
 * Copyright (C) 2020 Wolfox
 * All rights reserved
 */
public class DepartmentHead extends Leader {
    @Override
    public void handleRequest(int leaveDays) {
        if(LeaveDays<=7)
        {
            System.out.println("系主任批准您请假" + LeaveDays + "天。");
        }
        else
        {
            if(getNext() != null)
            {
                getNext().handleRequest(LeaveDays);
            }
            else
            {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
