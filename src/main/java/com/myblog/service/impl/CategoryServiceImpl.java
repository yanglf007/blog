package com.myblog.service.impl;

import com.myblog.dao.CategoryMapper;
import com.myblog.model.Category;
import com.myblog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/2/11.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public Category selectByPrimaryKey(Integer cId) {
        return categoryMapper.selectByPrimaryKey(cId);
    }
}
