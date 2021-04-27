package com.allams.mall.order.dao;

import com.allams.mall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author allams
 * @email allams@gmail.com
 * @date 2021-04-28 00:04:46
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
