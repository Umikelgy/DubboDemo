package annotate;

import annotate.serviceConsumer.GreetServiceConsumer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 *@description:
 *
 *@author 10068921(LgyTT)
 *@date 2018/8/28 17:02
 */
public class ConsumerApplication {
    public static void main(String[]args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        GreetServiceConsumer consumer=context.getBean(GreetServiceConsumer.class);
        String H=consumer.SayH("annotate");
        System.out.println("result:"+H);
        while(true);
    }
}
