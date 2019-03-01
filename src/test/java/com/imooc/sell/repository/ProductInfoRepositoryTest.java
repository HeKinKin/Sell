package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    ProductInfoRepository productInfoRepository;

    @Test
    public  void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("皮蛋粥");
        productInfo.setProductStock(100);
        productInfo.setProductDescription("真的好好喝啊");
        productInfo.setCategoryType(1);
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductIcon("www.xxxx.com");
        productInfo.setProductStatus(0);
        ProductInfo result = productInfoRepository.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByProductStatusTest() throws Exception {
        List<ProductInfo> productInfoList = productInfoRepository.findByProductStatusIn(0);
        Assert.assertNotEquals(0,productInfoList.size());
    }
}