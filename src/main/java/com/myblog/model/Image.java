package com.myblog.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/2/10.
 */
public class Image implements Serializable {
    private Integer imageId;
    private String imageName;
    private String imagePath;
    private Integer banner;
    private String content;
    private String dateTime;
    private Integer love;
    private Integer iht;

    @Override
    public String toString() {
        return "Image{" +
                "imageId=" + imageId +
                ", imageName='" + imageName + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", banner=" + banner +
                ", content='" + content + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", love=" + love +
                ", iht=" + iht +
                '}';
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Integer getBanner() {
        return banner;
    }

    public void setBanner(Integer banner) {
        this.banner = banner;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getLove() {
        return love;
    }

    public void setLove(Integer love) {
        this.love = love;
    }

    public Integer getIht() {
        return iht;
    }

    public void setIht(Integer iht) {
        this.iht = iht;
    }
}
