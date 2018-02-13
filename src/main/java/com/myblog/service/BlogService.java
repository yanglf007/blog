package com.myblog.service;

import com.myblog.model.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/2/11.
 */
@Service
public interface BlogService {

     List<Blog> findAllBlog();
     List<Blog> getBanner();
     List<Blog> getHits();
}
