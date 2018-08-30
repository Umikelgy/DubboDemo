package annotate;

import annotation.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resource;
import java.io.IOException;

/*
 *@description:
 *
 *@author 10068921(LgyTT)
 *@date 2018/8/27 16:28
 */

public class ProviderApplication  {

    public static  void main(String [] args) throws IOException {
       // new EmbeddedZooKeeper(2181, false).start(); // #1

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DubboConfiguration.class); // #2

        context.start(); // #3
        System.in.read(); // #4
    }
}