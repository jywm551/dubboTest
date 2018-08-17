package com.yu.dubbo.pojo;

import java.io.Serializable;

/**
 * Created By Yu On 2018/8/17
 * Description：
 **/
public class User implements Serializable {
    private static final long serialVersionUID = 4579167877226050530L;

    private Long id;
    private String userName;
    private String password;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
