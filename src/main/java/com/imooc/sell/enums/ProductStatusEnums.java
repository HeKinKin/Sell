package com.imooc.sell.enums;

import lombok.Getter;

/**
 * 商品状态枚举
 * @author hexin
 * @date 2019/02/26
 */
@Getter
public enum ProductStatusEnums {
    UP(0,"上架"),
    DOWN(1,"下架")
    ;
    private Integer code ;
    private String message;

    ProductStatusEnums(Integer code,String message) {
        this.code = code;
        this.message = message;
    }

}
