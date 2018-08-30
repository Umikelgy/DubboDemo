package annotate;


import com.alibaba.dubbo.config.*;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 *@description:
 *
 *@author 10068921(LgyTT)
 *@date 2018/8/27 16:05
 */
@Configuration
@EnableDubbo(scanBasePackages = "annotate.serviceimpl")
public class DubboConfiguration {
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig config=new ApplicationConfig();
        config.setName("provider-test");
        return config;

    }
    @Bean
    public ProviderConfig providerConfig(){
        ProviderConfig config=new ProviderConfig();
        config.setTimeout(1000);
        return config;
    }

    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig config=new RegistryConfig();
        config.setProtocol("zookeeper");
        config.setAddress("zookeeper://127.0.0.1:2181");
        config.setPort(2181);
        config.setCheck(false);
        config.setSubscribe(false);
        return config;
    }
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig config= new ProtocolConfig();
        config.setName("dubbo");
        config.setPort(20881);
        return config;
    }

}
