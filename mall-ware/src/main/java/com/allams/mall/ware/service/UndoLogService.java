package com.allams.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.allams.common.utils.PageUtils;
import com.allams.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author allams
 * @email allams@gmail.com
 * @date 2021-04-28 00:14:56
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

