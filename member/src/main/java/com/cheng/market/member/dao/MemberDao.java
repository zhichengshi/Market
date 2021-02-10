package com.cheng.market.member.dao;

import com.cheng.market.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author cheng
 * @email 1227257035@qq.com
 * @date 2021-02-03 17:48:07
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
