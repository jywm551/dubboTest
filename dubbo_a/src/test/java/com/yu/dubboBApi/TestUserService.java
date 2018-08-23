package com.yu.dubboBApi;

import com.yu.dubboB.pojo.User;
import com.yu.dubboB.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created By Yu On 2018/8/20
 * Description：
 **/
public class TestUserService {
    @Autowired @Lazy
    private UserService userService;

    @Before
    public void setUp() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo/*.xml");
        this.userService = context.getBean(UserService.class);
    }

    @Test
    public void testSelectAll(){
        List<User> userList = userService.selectAll();
        for (User u : userList) {
            System.out.println(u.toString());
        }
    }
}
