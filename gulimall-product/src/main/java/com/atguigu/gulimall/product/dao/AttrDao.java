package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author leaf
 * @email lxhu.work@gmail.com
 * @date 2021-05-27 10:32:29
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
