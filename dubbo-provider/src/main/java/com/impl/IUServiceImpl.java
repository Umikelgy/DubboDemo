package com.impl;

import com.tApi.IUserService;
import com.tApi.Params;
import com.tApi.User;

/*
 *@description:
 *
 *@author 10068921(LgyTT)
 *@date 2018/8/31 17:30
 */
public class IUServiceImpl implements IUserService {
    @Override
    public User get(Params params) {
        return new User(1,"charles");
    }

    @Override
    public String delete(int id) {
        return "dubbo";
    }
}
