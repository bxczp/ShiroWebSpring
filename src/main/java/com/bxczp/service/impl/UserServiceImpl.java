package com.bxczp.service.impl;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bxczp.dao.UserDao;
import com.bxczp.entity.User;
import com.bxczp.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public User getByUserName(String userName) {
        return userDao.getByUserName(userName);
    }

    public Set<String> getRoles(String userName) {
        return userDao.getRoles(userName);
    }

    public Set<String> getPermissions(String userName) {
        return userDao.getPermissions(userName);
    }

}
