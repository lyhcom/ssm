package com.zking.mybatis01.mapper;

import com.zking.mybatis01.model.TCustomerEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 * @create 2019-11-1211:55
 */
public interface CustomerMapper {

    List<TCustomerEntity> list(@Param("paramMap") Map<String,Object> paramMap);


}
