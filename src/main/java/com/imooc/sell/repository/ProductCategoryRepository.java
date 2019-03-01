package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 * 类目
 * @author hexin
 * @date 2019/02/26
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    /**
     * 查询
     * @param integerList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> integerList);
}
