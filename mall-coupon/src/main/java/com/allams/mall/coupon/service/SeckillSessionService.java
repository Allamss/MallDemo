package com.allams.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.allams.common.utils.PageUtils;
import com.allams.mall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author allams
 * @email allams@gmail.com
 * @date 2021-04-27 22:51:08
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

