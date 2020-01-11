package com.chilly.demo.mapper;

import com.chilly.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    /**
     * 获取用户
     * @return user
     */
    User getUser(@Param("userName")String userName, @Param("userPassword")String userPassword);
}
