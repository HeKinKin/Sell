package com.imooc.sell.enums;

import lombok.Getter;
/**
 * 订单状态枚举类
 * @author hexin
 * @date 2019/02/26
 */
@Getter
public enum OrderStatusEnums {
    NEW(0,"新订单"),
    FINISHED(1,"已完成"),
    CANCEL(2,"取消"),
    ;

    private Integer code ;
    private String message;

    OrderStatusEnums(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
