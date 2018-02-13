package com.myblog.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/2/11.
 */
public class Weibo implements Serializable{
    private Integer id;
    private String uid;
    private String name;
    private String location;
    private String url;
    private String createAt;
    private Integer type;
    private String text;
    private String typeName;

    @Override
    public String toString() {
        return "Weibo{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", url='" + url + '\'' +
                ", createAt='" + createAt + '\'' +
                ", type=" + type +
                ", text='" + text + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
