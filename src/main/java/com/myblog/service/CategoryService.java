package com.myblog.service;

import com.myblog.model.Category;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/2/11.
 */
@Service
public interface CategoryService {
    Category selectByPrimaryKey(Integer cId);
}
