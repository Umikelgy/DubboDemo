package annotate.serviceConsumer;

import annotation.DubboService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/*
 *@description:
 *
 *@author 10068921(LgyTT)
 *@date 2018/9/4 10:10
 */
@Component("dubboAnnotate")
public class DubboGreetService {
    @Reference
    private DubboService dubbo;

    public String doS(String name){
        return dubbo.getString(name);
    }
}
