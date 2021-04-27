package com.allams.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.allams.common.utils.PageUtils;
import com.allams.mall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author allams
 * @email allams@gmail.com
 * @date 2021-04-28 00:04:46
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

