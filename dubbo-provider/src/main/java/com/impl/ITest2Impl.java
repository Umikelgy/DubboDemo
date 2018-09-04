package com.impl;

import com.ITest2;

/*
 *@descripion:
 *
 *@author 10068921(LgyTT)
 *@date 2018/8/24 15:28
 */
public class ITest2Impl implements ITest2 {
    @Override
    public void SaySomething(String message) {
        System.out.println("Say+"+message);
    }
}
