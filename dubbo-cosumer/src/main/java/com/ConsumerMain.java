package com;

import api.DubboService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/*
 *@descripion:
 *
 *@author 10068921(LgyTT)
 *@date 2018/8/23 17:01
 */
public class ConsumerMain {
    public static void main(String []args){
       ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
       ((ClassPathXmlApplicationContext) applicationContext).start();
      DubboService iTest= (DubboService) applicationContext.getBean("dubboService");
        String str=iTest.getString("我在这里消费!@@@");
        System.out.println("poggyio-dubbo-str:"+str);

      //  ITest2 i2=(ITest2)applicationContext.getBean("serviceA");
        //i2.SaySomething("I am consumer!!");

      /*  GreetingService service= (GreetingService) applicationContext.getBean("greetService");
      String str=  service.sayS("ConsumerMain say Hello!!!");
        System.out.println(str);*/

//      GenericService genericService= (GenericService) applicationContext.getBean("IUserService");
//      genericService.$invoke("delete",new String[]{int.class.getName()},new Object[]{1});


        try {
            System.in.read();

        } catch (IOException e) {
           System.out.println(e.getMessage());
        }
    }
}
