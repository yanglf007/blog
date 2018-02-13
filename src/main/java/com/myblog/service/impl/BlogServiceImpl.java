package com.myblog.service.impl;

import com.myblog.dao.BlogMapper;
import com.myblog.model.Blog;
import com.myblog.service.BlogService;
import com.myblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/2/11.
 */
@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogMapper blogMapper;

    @Autowired
    private CategoryService categoryService;

    @Override
    public List<Blog> findAllBlog() {
        List<Blog> blogs = blogMapper.findAllBlog();
        for (Blog blog:blogs
             ) {
            blog.setCategory(categoryService.selectByPrimaryKey(blog.getCategoryid()));
        }
        return blogs;
    }

    @Override
    public List<Blog> getBanner() {
        return blogMapper.getBanner();
    }

    @Override
    public List<Blog> getHits() {
        return blogMapper.getHits();
    }

}
