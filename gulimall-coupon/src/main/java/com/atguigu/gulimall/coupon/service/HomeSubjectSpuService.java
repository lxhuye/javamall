package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author leaf
 * @email lxhu.work@gmail.com
 * @date 2021-05-30 23:39:43
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

