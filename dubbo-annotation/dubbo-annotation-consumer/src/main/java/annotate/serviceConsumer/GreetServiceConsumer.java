package annotate.serviceConsumer;

import annotation.GreetingService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/*
 *@description:
 *
 *@author 10068921(LgyTT)
 *@date 2018/8/28 16:56
 */
@Component("annotate")
public class GreetServiceConsumer {
    @Reference
    private GreetingService service;
    public String SayH(String name){
        return service.sayS(name);
    }
}
