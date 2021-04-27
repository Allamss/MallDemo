package com.allams.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.allams.common.utils.PageUtils;
import com.allams.mall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author allams
 * @email allams@gmail.com
 * @date 2021-04-28 00:14:56
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

