package com.myblog.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/2/11.
 */
public class Relation implements Serializable {
    private Integer id;
    private Integer blogId;
    private List<Tag> tags;
    private Blog blog;
    private Integer tId;

    @Override
    public String toString() {
        return "Relation{" +
                "id=" + id +
                ", blogId=" + blogId +
                ", tags=" + tags +
                ", blog=" + blog +
                ", tId=" + tId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }
}
