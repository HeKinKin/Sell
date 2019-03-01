package com.imooc.sell.service.Impl;

import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.enums.OrderStatusEnums;
import com.imooc.sell.enums.PayStatusEnums;
import com.imooc.sell.service.OrderService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrdeServiceImplTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void create() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerOpenid("123123");
        orderDTO.setBuyerAddress("南京市");
        orderDTO.setBuyerName("贺鑫");
        orderDTO.setBuyerPhone("18816236850");

        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setProductId("123456");
        orderDetail.setProductQuantity(2);
        orderDetailList.add(orderDetail);
        orderDTO.setOrderDetailList(orderDetailList);
        orderService.create(orderDTO);


    }

    @Test
    public void findOne() {
        OrderDTO result =orderService.findOne("1551324274383382477");
        Assert.assertEquals("1551324274383382477",result.getOrderId());
    }

    @Test
    public void findList() {
        PageRequest pageRequest = new PageRequest(0,2);
        Page<OrderDTO> orderDTOPage = orderService.findList("123123",pageRequest);
        Assert.assertNotEquals(0,orderDTOPage.getTotalElements());
    }

    @Test
    public void cancel() {
        OrderDTO result =orderService.findOne("1551324274383382477");
        OrderDTO orderDTO = orderService.cancel(result);
        Assert.assertEquals(OrderStatusEnums.CANCEL.getCode(),orderDTO.getOrderStatus());

    }

    @Test
    public void finish() {
        OrderDTO result =orderService.findOne("1551324274383382477");
        OrderDTO orderDTO = orderService.finish(result);
        Assert.assertEquals(OrderStatusEnums.FINISHED.getCode(),orderDTO.getOrderStatus());

    }

    @Test
    public void paid() {
        OrderDTO result =orderService.findOne("1551324274383382477");
        OrderDTO orderDTO = orderService.finish(result);
        Assert.assertEquals(PayStatusEnums.SUCCESS.getCode(),orderDTO.getPayStatus());

    }
}