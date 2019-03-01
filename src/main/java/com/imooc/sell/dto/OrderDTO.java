package com.imooc.sell.dto;

import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.enums.OrderStatusEnums;
import com.imooc.sell.enums.PayStatusEnums;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 入参
 * @author hexin
 * @date 2019/02/26
 */
@Data
public class OrderDTO {
    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 买家姓名
     */
    private String buyerName;
    /**
     * 买家手机
     */
    private String buyerPhone;
    /**
     * 买家地址
     */
    private String buyerAddress;
    /**
     * 买家微信ID
     */
    private String buyerOpenid;
    /**
     * 订单金额
     */
    private BigDecimal orderAmount;
    /**
     * 订单状态，默认为0，未下单
     */
    private Integer orderStatus;
    /**
     * 支付状态,默认为0，未支付
     */
    private Integer payStatus;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

    private List<OrderDetail> orderDetailList;
}
