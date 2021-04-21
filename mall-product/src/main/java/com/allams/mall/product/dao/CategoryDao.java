package com.allams.mall.product.dao;

import com.allams.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author allams
 * @email allams@gmail.com
 * @date 2021-04-21 23:53:01
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
