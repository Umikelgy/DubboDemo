package annotate.serviceimpl;

import annotation.GreetingService;
import com.alibaba.dubbo.config.annotation.Service;

/*
 *@description:
 *
 *@author 10068921(LgyTT)
 *@date 2018/8/28 15:49
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayS(String name) {
       // System.out.println(name);
        return "hello"+name;
    }
}
