package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 订单详情表
 * @author hexin
 * @date 2019/02/26
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
    /**
     * 通过订单ID查询
     * @param orderId
     * @return
     */
    List<OrderDetail> findByOrderId(String  orderId);
}
