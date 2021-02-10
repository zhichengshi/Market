package com.cheng.market.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cheng.common.utils.PageUtils;
import com.cheng.common.utils.Query;

import com.cheng.market.product.dao.CategoryDao;
import com.cheng.market.product.entity.CategoryEntity;
import com.cheng.market.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public void removeMenuByIds(List<Long> asList) {
        // TODO 检查当前删除的菜单，是否被别的地方引用
        baseMapper.deleteBatchIds(asList);
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1、查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);

        //2、组装成父子的树形结构
        List<CategoryEntity> level1Menus = entities.stream().filter(categoryEntity -> categoryEntity.getParentCid() == 0).map(categoryEntity ->
        {
            categoryEntity.setChildren(getChildren(categoryEntity, entities));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            return Optional.ofNullable(menu1.getSort()).orElse(0) - Optional.ofNullable(menu2.getSort()).orElse(0);
        }).collect(Collectors.toList());


        return level1Menus;

    }

    public List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {

        List<CategoryEntity> children = all.stream().filter(categoryEntity -> categoryEntity.getParentCid() == root.getCatId()).
                map(categoryEntity -> {
                    categoryEntity.setChildren(getChildren(categoryEntity, all));
                    return categoryEntity;
                }).sorted((menu1, menu2) -> {
            return Optional.ofNullable(menu1.getSort()).orElse(0) - Optional.ofNullable(menu2.getSort()).orElse(0);
        }).collect(Collectors.toList());
        return children;
    }

}