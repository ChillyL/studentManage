package com.chilly.demo.service.impl;

import com.chilly.demo.entity.User;
import com.chilly.demo.mapper.UserMapper;
import com.chilly.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import static com.chilly.demo.util.MD5Utils.codeMD5;

/**
 * @auther ChillyLin
 * @date 2019/12/27
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    /**
     * 获取用户
     * @return user
     */
    @Override
    public User getUser(String userName, String userPassword){
        return userMapper.getUser(userName,codeMD5(userPassword));
    }
}
