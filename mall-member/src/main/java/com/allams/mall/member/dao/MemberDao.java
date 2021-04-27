package com.allams.mall.member.dao;

import com.allams.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author allams
 * @email allams@gmail.com
 * @date 2021-04-27 23:50:39
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
