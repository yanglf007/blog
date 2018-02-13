package com.myblog.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/2/11.
 */
public class UserInfo implements Serializable {
    /**
     * 是否登录
     * 0表示未登录，1表示已登录
     */
    private int isLogin;

    private User user;

    @Override
    public String toString() {
        return "UserInfo{" +
                "isLogin=" + isLogin +
                ", user=" + user +
                '}';
    }

    public int getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(int isLogin) {
        this.isLogin = isLogin;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
