package com.myblog.service;

import com.myblog.model.Blog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2018/2/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class BlogServiceTest {

    @Autowired
    private BlogService blogService;
    @Test
    public void findAllBlog() throws Exception {
        List<Blog> allBlog = blogService.findAllBlog();
        for (Blog blog:allBlog
             ) {
            System.out.println(blog.toString());
        }
    }

}