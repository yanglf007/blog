package com.myblog.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2018/2/10.
 */
public class IpLog implements Serializable {
    private Integer id;
    private Integer sId;
    private String ip;
    private Date ipTime;
    private String area;
    private String uri;
    private Long responseTime;
    private Integer visitNum;
    private String referer;

    @Override
    public String toString() {
        return "IpLog{" +
                "id=" + id +
                ", sId=" + sId +
                ", ip='" + ip + '\'' +
                ", ipTime=" + ipTime +
                ", area='" + area + '\'' +
                ", uri='" + uri + '\'' +
                ", responseTime=" + responseTime +
                ", visitNum=" + visitNum +
                ", referer='" + referer + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getIpTime() {
        return ipTime;
    }

    public void setIpTime(Date ipTime) {
        this.ipTime = ipTime;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Long responseTime) {
        this.responseTime = responseTime;
    }

    public Integer getVisitNum() {
        return visitNum;
    }

    public void setVisitNum(Integer visitNum) {
        this.visitNum = visitNum;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }
}
