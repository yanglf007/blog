package com.myblog.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/2/10.
 */
public class Links implements Serializable {
    private Integer lId;
    private String name;
    private String url;
    private String logo;
    private Integer sort;

    @Override
    public String toString() {
        return "Links{" +
                "lId=" + lId +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", logo='" + logo + '\'' +
                ", sort=" + sort +
                '}';
    }

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
