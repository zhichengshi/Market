package com.cheng.market.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheng.common.utils.PageUtils;
import com.cheng.market.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author cheng
 * @email 1227257035@qq.com
 * @date 2021-02-03 17:51:21
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

