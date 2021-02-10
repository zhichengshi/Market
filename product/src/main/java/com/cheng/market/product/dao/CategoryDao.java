package com.cheng.market.product.dao;

import com.cheng.market.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author cheng
 * @email 1227257035@qq.com
 * @date 2021-02-03 17:51:21
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
