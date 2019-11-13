package com.zking.mybatis01.service;

import com.zking.mybatis01.model.TCustomerEntity;
import com.zking.mybatis01.model.TOrderEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 * @create 2019-11-1212:30
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext*.xml"})
public class CustomerServiceImplTest {

    @Resource
    private CustomerService customerService;

    @Test
    public void testList() {
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("name", "zs");
        List<TCustomerEntity> lst = customerService.list(paramMap);
        for(TCustomerEntity c :  lst) {
            System.out.println("====================================");
            System.out.println(c);
            for(TOrderEntity o: c.getOrders()) {
                System.out.println(o);
            }

        }

    }

}