package com.myblog.dao;

import com.myblog.model.Category;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/2/11.
 */
@Repository
public interface CategoryMapper {
    Category selectByPrimaryKey(Integer cId);
}
