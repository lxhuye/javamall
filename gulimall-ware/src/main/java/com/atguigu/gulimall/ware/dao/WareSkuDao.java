package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author leaf
 * @email lxhu.work@gmail.com
 * @date 2021-05-30 23:50:37
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
