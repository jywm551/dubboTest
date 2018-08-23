package com.yu.dubboB.service;


import com.yu.dubboB.pojo.User;

import java.util.List;

/**
 * Created By Yu On 2018/8/17
 * Description：
 **/
public interface UserService {

    List<User> selectAll();
}
