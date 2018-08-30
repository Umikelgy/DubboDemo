package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *@descripion:
 *
 *@author 10068921(LgyTT)
 *@date 2018/8/23 16:44
 */
public class ProviderMain {
    public static void main(String []args){
       new ClassPathXmlApplicationContext( new String[]{"classpath*:applicationContext.xml"});
        while (true);
    }
}
