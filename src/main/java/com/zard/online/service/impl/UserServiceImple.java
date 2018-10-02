package com.zard.online.service.impl;

import com.zard.online.dao.UserMapper;
import com.zard.online.model.User;
import com.zard.online.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImple implements UserService {
    @Resource
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(int userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }

}
