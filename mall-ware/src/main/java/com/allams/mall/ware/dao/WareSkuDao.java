package com.allams.mall.ware.dao;

import com.allams.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author allams
 * @email allams@gmail.com
 * @date 2021-04-28 00:14:56
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
