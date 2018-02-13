package com.myblog.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/2/10.
 */
public class User implements Serializable{

    //用户在自己网站中的id

    private int user_id;
    /**
     * 用户签名
     */
    private String sign;
    /**
     * 用户头像地址
     */
    private String imageUrl;
    /**
     * 用户昵称
     */
    private String nickName;
    /**
     * 用户主页地址
     */
    private String profileUrl;

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", sign='" + sign + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", nickName='" + nickName + '\'' +
                ", profileUrl='" + profileUrl + '\'' +
                '}';
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }
}
