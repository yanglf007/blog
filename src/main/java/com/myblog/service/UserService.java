package com.myblog.service;

import com.myblog.dao.UserMapper;
import com.myblog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/2/10.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    public User findById(String id){
        return userMapper.selectByPrimaryKey(id);
    }
}
