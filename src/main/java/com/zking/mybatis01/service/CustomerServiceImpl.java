package com.zking.mybatis01.service;

import com.zking.mybatis01.mapper.CustomerMapper;
import com.zking.mybatis01.model.TCustomerEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 * @create 2019-11-1212:28
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Resource
    private CustomerMapper customerMapper;

    public List<TCustomerEntity> list(Map<String,Object> paramMap) {
        return customerMapper.list(paramMap);
    }

}
