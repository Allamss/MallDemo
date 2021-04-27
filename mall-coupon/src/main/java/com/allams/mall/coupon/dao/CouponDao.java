package com.allams.mall.coupon.dao;

import com.allams.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author allams
 * @email allams@gmail.com
 * @date 2021-04-27 22:51:08
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
