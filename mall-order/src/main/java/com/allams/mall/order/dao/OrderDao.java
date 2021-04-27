package com.allams.mall.order.dao;

import com.allams.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author allams
 * @email allams@gmail.com
 * @date 2021-04-28 00:04:46
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
