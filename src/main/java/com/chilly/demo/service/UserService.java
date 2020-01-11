package com.chilly.demo.service;

import com.chilly.demo.entity.User;

public interface UserService {
    /**
     * 获取用户
     * @return user
     */
    User getUser(String userName, String userPassword);
}
