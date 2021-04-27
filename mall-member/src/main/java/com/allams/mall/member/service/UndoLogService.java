package com.allams.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.allams.common.utils.PageUtils;
import com.allams.mall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author allams
 * @email allams@gmail.com
 * @date 2021-04-27 23:50:39
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

