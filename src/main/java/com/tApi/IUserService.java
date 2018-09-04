package com.tApi;

/*
 *@description:
 *
 *@author 10068921(LgyTT)
 *@date 2018/8/31 17:25
 */
public interface IUserService {

    User get(Params params);

    String delete(int id);
}
