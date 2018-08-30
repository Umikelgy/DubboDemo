package com;

import com.alibaba.dubbo.config.annotation.Service;

/*
 *@description:
 *
 *@author 10068921(LgyTT)
 *@date 2018/8/27 15:50
 */
@Service(timeout = 3000)
public interface AnnotateService {
    public void SayAnnotation(String message);
}
