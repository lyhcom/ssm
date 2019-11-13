package com.zking.mybatis01.service;

import com.zking.mybatis01.mapper.OrderMapper;
import com.zking.mybatis01.model.TOrderEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @create 2019-11-1312:33
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<TOrderEntity> list(TOrderEntity order) {
        return orderMapper.list(order);
    }

}
