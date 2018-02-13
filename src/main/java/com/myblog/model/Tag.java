package com.myblog.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/2/10.
 */
public class Tag implements Serializable{
    private Integer tId;
    private String tName;
    private List<Blog> blogs;

    @Override
    public String toString() {
        return "Tag{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                ", blogs=" + blogs +
                '}';
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}
