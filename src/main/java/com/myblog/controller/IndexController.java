package com.myblog.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.myblog.model.Blog;
import com.myblog.service.BlogService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2018/2/11.
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController {

    @Autowired
    private BlogService blogService;
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/hello")
    public ModelAndView sayHello(){
        logger.info("访问hello");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        return mv;
    }

    @RequestMapping(value = "/index")
    public ModelAndView index(HttpServletRequest request){
        logger.info("访问首页");
        String page = request.getParameter("pagenum");
        Integer pagenum;
        if(StringUtils.isEmpty(page)){
            pagenum=1;
        }else {
           pagenum = Integer.parseInt(page);
        }
        PageHelper.startPage(pagenum,15);
        ModelAndView mv = new ModelAndView();
        List<Blog> list = blogService.findAllBlog();
        List<Blog> banners = blogService.getBanner();
        PageInfo<Blog> blogs = new PageInfo<Blog>(list);
        Integer startpage,endpage;
        if (blogs.getPages()<6){
            startpage=1;
            endpage=blogs.getPages();
        }else {
            if (pagenum>3){
                startpage = blogs.getPageNum()-3;
                endpage = blogs.getPageNum() + 3 > blogs.getPages() ? blogs.getPages() : blogs.getPageNum();
            }else {
                startpage=1;
                endpage=blogs.getPages()+4;
            }

        }
        List<Blog> hotblogs = blogService.getHits();
        mv.addObject("startpage",startpage);
        mv.addObject("endpage",endpage);
        mv.addObject("hotBlogs",hotblogs);
        mv.addObject("blogs",blogs.getList());
        mv.addObject("totalpage",blogs.getPages());
        mv.addObject("pageNum",blogs.getPageNum());
        mv.addObject("banners",banners);
        mv.setViewName("index");
        return mv;

    }

    @RequestMapping(value = "/404")
    public ModelAndView fourzerofour(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/404.jsp");
        return mv;

    }
}
