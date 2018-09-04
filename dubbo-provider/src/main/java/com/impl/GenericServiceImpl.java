package com.impl;

import com.alibaba.dubbo.rpc.service.GenericService;

/*
 *@description:
 *
 *@author 10068921(LgyTT)
 *@date 2018/8/31 15:05
 */
public class GenericServiceImpl implements GenericService {
    @Override
    public Object $invoke(String method, String[] parameterTypes, Object[] args) {
        if(method.equals("hi"))
            return "hi,"+args[0];
        else if(method.equals("hello"))
            return "hello,"+args[0];
        return "welcome";
    }

}
