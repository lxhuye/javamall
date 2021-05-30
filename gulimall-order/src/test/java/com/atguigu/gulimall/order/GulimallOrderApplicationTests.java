package com.atguigu.gulimall.order;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.atguigu.gulimall.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallOrderApplicationTests {

    @Autowired
    OrderService orderService;
    @Test
    void contextLoads() {
//        OrderEntity orderEntity = new OrderEntity();
//        orderEntity.setBillContent("this is a content");
//        orderService.save(orderEntity);
//        System.out.println("保存成功");
    }

}
