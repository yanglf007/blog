package com.myblog.dao;

import com.myblog.model.User;

/**
 * Created by Administrator on 2018/2/10.
 */
public interface UserMapper {
    User selectByPrimaryKey(String id);
}
