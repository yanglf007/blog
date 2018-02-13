package com.myblog.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/2/10.
 */
public class Category implements Serializable{
    private Integer cId;
    private String cName;
    private String cDescrip;
    private Integer cNum;

    @Override
    public String toString() {
        return "Category{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", cDescrip='" + cDescrip + '\'' +
                ", cNum=" + cNum +
                '}';
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcDescrip() {
        return cDescrip;
    }

    public void setcDescrip(String cDescrip) {
        this.cDescrip = cDescrip;
    }

    public Integer getcNum() {
        return cNum;
    }

    public void setcNum(Integer cNum) {
        this.cNum = cNum;
    }
}
