package com.myblog.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/2/11.
 */
public class TongJi implements Serializable {
    private String pv_count;
    private String visitor_count;
    private String id_count;
    private String bount_ratio;
    private String avg_visit_time;
    private String date;

    @Override
    public String toString() {
        return "TongJi{" +
                "pv_count='" + pv_count + '\'' +
                ", visitor_count='" + visitor_count + '\'' +
                ", id_count='" + id_count + '\'' +
                ", bount_ratio='" + bount_ratio + '\'' +
                ", avg_visit_time='" + avg_visit_time + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public String getPv_count() {
        return pv_count;
    }

    public void setPv_count(String pv_count) {
        this.pv_count = pv_count;
    }

    public String getVisitor_count() {
        return visitor_count;
    }

    public void setVisitor_count(String visitor_count) {
        this.visitor_count = visitor_count;
    }

    public String getId_count() {
        return id_count;
    }

    public void setId_count(String id_count) {
        this.id_count = id_count;
    }

    public String getBount_ratio() {
        return bount_ratio;
    }

    public void setBount_ratio(String bount_ratio) {
        this.bount_ratio = bount_ratio;
    }

    public String getAvg_visit_time() {
        return avg_visit_time;
    }

    public void setAvg_visit_time(String avg_visit_time) {
        this.avg_visit_time = avg_visit_time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
