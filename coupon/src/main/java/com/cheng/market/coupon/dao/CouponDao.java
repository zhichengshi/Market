package com.cheng.market.coupon.dao;

import com.cheng.market.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author cheng
 * @email 1227257035@qq.com
 * @date 2021-02-03 17:38:22
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
