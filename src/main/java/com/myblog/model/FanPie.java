package com.myblog.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/2/10.
 */
public class FanPie implements Serializable {
    private String name;
    private Integer visitor_count;
    private Double pv_ratio;
    private Integer pv_count;

    @Override
    public String toString() {
        return "FanPie{" +
                "name='" + name + '\'' +
                ", visitor_count=" + visitor_count +
                ", pv_ratio=" + pv_ratio +
                ", pv_count=" + pv_count +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVisitor_count() {
        return visitor_count;
    }

    public void setVisitor_count(Integer visitor_count) {
        this.visitor_count = visitor_count;
    }

    public Double getPv_ratio() {
        return pv_ratio;
    }

    public void setPv_ratio(Double pv_ratio) {
        this.pv_ratio = pv_ratio;
    }

    public Integer getPv_count() {
        return pv_count;
    }

    public void setPv_count(Integer pv_count) {
        this.pv_count = pv_count;
    }
}
