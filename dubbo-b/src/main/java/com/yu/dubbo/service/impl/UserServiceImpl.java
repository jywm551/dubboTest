package com.yu.dubbo.service.impl;

import com.yu.dubbo.pojo.User;
import com.yu.dubbo.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By Yu On 2018/8/17
 * Description：
 **/
public class UserServiceImpl implements UserService {
    @Override
    public List<User> selectAll() {
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setAge(20 + i);
            user.setId(Long.valueOf(i + 1));
            user.setPassword("123456");
            user.setUserName("username_" + i);
            list.add(user);
        }
        return list;

    }
}
