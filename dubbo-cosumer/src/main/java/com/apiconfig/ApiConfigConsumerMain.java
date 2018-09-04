package com.apiconfig;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.rpc.service.GenericService;

/*
 *@description:
 *
 *@author 10068921(LgyTT)
 *@date 2018/8/31 11:47
 */
public class ApiConfigConsumerMain {

    public static  void main(String []args){
//        当前应用配置
        ApplicationConfig application=new ApplicationConfig();
        application.setName("i-consumer");

//        链接注册中心配置
        RegistryConfig registry=new RegistryConfig();
        registry.setAddress("zookeeper://127.0.0.1:2181");
        registry.setUsername("root");
        registry.setPassword("root");

//      引用远程服务配置
        ReferenceConfig<GenericService> reference= new ReferenceConfig<GenericService>();
        reference.setApplication(application);
        reference.setRegistry(registry);
        reference.setInterface(GenericService.class);
        reference.setGeneric(true);

        GenericService greetingService=reference.get();//注意，此代理对象内部封装了所有通信细节，对象较重，请缓存复用
        String str=greetingService.$invoke("delete",new String[]{int.class.getName()},new Object[]{1}).toString();
        System.out.println("Str="+str);
    }
}
