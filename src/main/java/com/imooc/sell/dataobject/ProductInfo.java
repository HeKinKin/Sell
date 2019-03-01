package com.imooc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 商品
 * @author hexin
 * @date 2019/02/26
 */
@Entity
@Data
public class ProductInfo {
    /**
     * 商品ID
     */
    @Id
    private String productId;
    /**
     * 商品名字
     */
    private String productName;
    /**
     * 商品价格
     */
    private BigDecimal productPrice;
    /**
     * 商品库存
     */
    private Integer productStock;
    /**
     * 商品状态
     */
    private Integer productStatus;
    /**
     * 商品描述
     */
    private String productDescription;
    /**
     * 商品小图
     */
    private String productIcon;
    /**
     * 类目编号
     */
    private Integer categoryType;





}
