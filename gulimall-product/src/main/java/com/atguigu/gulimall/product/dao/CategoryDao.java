package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author leaf
 * @email lxhu.work@gmail.com
 * @date 2021-05-30 15:28:37
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
