package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/*
 *@descripion:
 *
 *@author 10068921(LgyTT)
 *@date 2018/8/24 15:44
 */
public class Consumer2 {
    @Resource(name = "springservice")
    private static ITest springservice;
    public static void main(String[]args){
       /* ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        ITest i2= (ITest) applicationContext.getBean("springservice");

        i2.SayHello("I am Consumer2 ");*/
        springservice.SayHello("I am CONSUMER2");

    }
}
