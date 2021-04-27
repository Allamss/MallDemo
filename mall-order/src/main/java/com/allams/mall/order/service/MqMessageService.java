package com.allams.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.allams.common.utils.PageUtils;
import com.allams.mall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author allams
 * @email allams@gmail.com
 * @date 2021-04-28 00:04:46
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

