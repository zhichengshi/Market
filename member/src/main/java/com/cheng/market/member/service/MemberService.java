package com.cheng.market.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheng.common.utils.PageUtils;
import com.cheng.market.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author cheng
 * @email 1227257035@qq.com
 * @date 2021-02-03 17:48:07
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

