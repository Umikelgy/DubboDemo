package com;

/*
 *@descripion:
 *
 *@author 10068921(LgyTT)
 *@date 2018/8/23 16:34
 */
public class Test implements ITest {

    @Override
    public void SayHello(String message) {

        System.out.println("service say:"+message);
    }


}
