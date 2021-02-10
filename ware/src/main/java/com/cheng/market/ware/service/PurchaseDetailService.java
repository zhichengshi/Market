package com.cheng.market.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheng.common.utils.PageUtils;
import com.cheng.market.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author cheng
 * @email 1227257035@qq.com
 * @date 2021-02-03 17:57:37
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

