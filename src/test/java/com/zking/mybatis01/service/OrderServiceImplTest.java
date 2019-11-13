package com.zking.mybatis01.service;

import com.zking.mybatis01.model.TOrderEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @create 2019-11-1312:35
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext*.xml"})
public class OrderServiceImplTest {

    @Resource
    private OrderService orderService;

    @Test
    public void list() {

        TOrderEntity order = new TOrderEntity();
        List<TOrderEntity> lst = orderService.list(order);

        for(TOrderEntity o: lst) {
            System.out.println(o);

        }

    }
}