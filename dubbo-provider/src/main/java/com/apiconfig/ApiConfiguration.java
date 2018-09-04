package com.apiconfig;

import com.ITest;
import com.impl.Test;
import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

/*
 *@description:
 *
 *@author 10068921(LgyTT)
 *@date 2018/8/31 11:34
 */
public class ApiConfiguration {
     static ITest  test=new Test();
    public static void main(String []args){

//        当前应用配置
        ApplicationConfig config=new ApplicationConfig();
        config.setName("I-provider");

//        连接注册中心配置
        RegistryConfig configR=new RegistryConfig();
        configR.setAddress("zookeeper://127.0.0.1:2181");
        configR.setUsername("root");
        configR.setPassword("root");

//        服务提供者协议配置
        ProtocolConfig configP=new ProtocolConfig();
        configP.setName("dubbo");
        configP.setPort(2990);

//        服务提供者暴露服务配置
        ServiceConfig<ITest> service=new ServiceConfig<ITest>();
        service.setApplication(config);
        service.setRegistry(configR);
        service.setProtocol(configP);
        service.setInterface(ITest.class);
        service.setRef(test);
        service.export();//暴露注册服务
        while (true);
    }
}
