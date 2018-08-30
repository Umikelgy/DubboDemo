package annotate;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 *@description:
 *
 *@author 10068921(LgyTT)
 *@date 2018/8/28 16:48
 */
@Configuration
@EnableDubbo(scanBasePackages = "annotate.serviceConsumer")
@ComponentScan(value = "annotate.serviceConsumer")
public class ConsumerConfiguration {
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig config=new ApplicationConfig();
        config.setName("dubbo-annotation-consumer");
        return config;
    }
    @Bean
    public ConsumerConfig consumerConfig(){
        ConsumerConfig config=new ConsumerConfig();
        config.setTimeout(3000);
        return config;
    }
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig config=new RegistryConfig();
        config.setProtocol("zookeeper");
        config.setPort(2181);
        config.setAddress("zookeeper://127.0.0.1:2181");
        return config;
    }
}
