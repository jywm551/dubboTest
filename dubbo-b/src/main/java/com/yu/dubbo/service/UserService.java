package com.yu.dubbo.service;

import com.yu.dubbo.pojo.User;

import java.util.List;

/**
 * Created By Yu On 2018/8/17
 * Description：
 **/
public interface UserService {

    List<User> selectAll();
}
