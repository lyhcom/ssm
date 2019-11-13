package com.zking.mybatis01.service;

import com.zking.mybatis01.model.TOrderEntity;

import java.util.List;

/**
 * @author Administrator
 * @create 2019-11-1312:33
 */
public interface OrderService {


    List<TOrderEntity> list(TOrderEntity order);
}
