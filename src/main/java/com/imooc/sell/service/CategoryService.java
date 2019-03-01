package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * @author hexin
 * @date 2019/02/26
 */
public interface CategoryService {
    /**
     *     查询一条
     */
    ProductCategory findOne(Integer categoryId);
    /**
     * 查询所有
     */
    List<ProductCategory> findAll();
    /**
     * 通过编号查询
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> list);
    /**
     * 新增类目
     */
    ProductCategory save(ProductCategory productCategory);

}
