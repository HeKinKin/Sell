package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * 商品
 * @author hexin
 * @date 2019/02/26
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    /**
     * 查询
     * @param productStatus
     * @return
     */
    List<ProductInfo> findByProductStatusIn(Integer productStatus);
}
