package com.allams.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.allams.common.utils.PageUtils;
import com.allams.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author allams
 * @email allams@gmail.com
 * @date 2021-04-21 23:53:01
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

