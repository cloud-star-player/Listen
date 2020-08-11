package com.systop.demo.service.impl;

import com.systop.demo.mapper.UserMapper;
import com.systop.demo.pojo.User;
import com.systop.demo.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Userserviceimpl implements Userservice {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int register(String user_code, String user_password,String user_name){
         return userMapper.register(user_code,user_password,user_name);
    }

    @Override
    public User susercode(String user_code) {
        return userMapper.susercode(user_code);
    }

    @Override
    public User suserpassword(String user_password) {
        return userMapper.suserpassword(user_password);
    }

    @Override
    public User susername(String user_name) {
        return userMapper.susername(user_name);
    }

    @Override
    public Integer userupdate(String user_code, String user_password) {
        return userMapper.userupdate(user_code,user_password);
    }


    @Override
    public User login(String user_code, String user_password) {
        return userMapper.login(user_code,user_password);
    }

    @Override
    public List<User> findUser() {
        return userMapper.findUser();
    }

    @Override
    public User findUserall(Integer user_id) {
        return userMapper.findUserall(user_id);
    }


}
