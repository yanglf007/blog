package com.myblog.dao;

import com.myblog.model.Blog;

import java.util.List;

/**
 * Created by Administrator on 2018/2/11.
 */
public interface BlogMapper {
    List<Blog> findAllBlog();
    List<Blog> getBanner();
    List<Blog> getHits();

}
