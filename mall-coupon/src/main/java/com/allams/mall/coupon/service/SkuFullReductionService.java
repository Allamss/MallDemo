package com.allams.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.allams.common.utils.PageUtils;
import com.allams.mall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author allams
 * @email allams@gmail.com
 * @date 2021-04-27 22:51:08
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

