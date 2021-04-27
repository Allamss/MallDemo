package com.allams.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.allams.common.utils.PageUtils;
import com.allams.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author allams
 * @email allams@gmail.com
 * @date 2021-04-27 23:50:39
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

