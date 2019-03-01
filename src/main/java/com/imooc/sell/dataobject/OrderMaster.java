package com.imooc.sell.dataobject;

import com.imooc.sell.enums.OrderStatusEnums;
import com.imooc.sell.enums.PayStatusEnums;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单主表
 * @author hexin
 * @date 2019/02/26
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    /**
     * 订单ID
     */
    @Id
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
    private Integer orderStatus = OrderStatusEnums.NEW.getCode();
    /**
     * 支付状态,默认为0，未支付
     */
    private Integer payStatus = PayStatusEnums.WAIT.getCode();
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
}
