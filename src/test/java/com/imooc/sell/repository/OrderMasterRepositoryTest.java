package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    OrderMasterRepository repository;

    @Test
    public void save() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("12346521");
        orderMaster.setBuyerName("贺鑫");
        orderMaster.setBuyerAddress("鼎捷软甲文竹路");
        orderMaster.setBuyerPhone("18816236850");
        orderMaster.setBuyerOpenid("12312311");
        orderMaster.setOrderAmount(new BigDecimal(2.3));
        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);
    }
    @Test
    public void  findByBuyerOpenidTest() {
        PageRequest pageRequest = new PageRequest(0,2);
        Page<OrderMaster> result = repository.findByBuyerOpenid("123123",pageRequest);
        Assert.assertNotEquals(0,result.getTotalElements());
    }
}