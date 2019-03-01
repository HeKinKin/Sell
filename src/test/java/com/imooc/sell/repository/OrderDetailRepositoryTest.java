package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {
    @Autowired
    OrderDetailRepository repository;

    @Test
    public void save() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("21321");
        orderDetail.setOrderId("2310");
        orderDetail.setProductId("321");
        orderDetail.setProductIcon("www.xxxx.jpg");
        orderDetail.setProductName("挺好的");
        orderDetail.setProductPrice(new BigDecimal(3.2));
        orderDetail.setProductQuantity(321);
        OrderDetail orderDetail1 = repository.save(orderDetail);
        Assert.assertNotNull(orderDetail);
    }

    @Test
    public void load() {
        List<OrderDetail> o = repository.findByOrderId("2310");
        Assert.assertNotEquals(0,o.size());
    }
}