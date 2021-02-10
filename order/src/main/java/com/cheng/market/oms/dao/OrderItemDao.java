package com.cheng.market.oms.dao;

import com.cheng.market.oms.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author cheng
 * @email 1227257035@qq.com
 * @date 2021-02-03 17:17:34
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
