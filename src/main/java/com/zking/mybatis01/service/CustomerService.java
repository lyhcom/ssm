package com.zking.mybatis01.service;

import com.zking.mybatis01.model.TCustomerEntity;

import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 * @create 2019-11-1212:27
 */
public interface CustomerService {

    List<TCustomerEntity> list(Map<String,Object> paramMap);
}
