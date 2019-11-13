package com.zking.mybatis01.mapper;

import com.zking.mybatis01.model.TOrderEntity;

import java.util.List;

/**
 * @author Administrator
 * @create 2019-11-1312:22
 */
public interface OrderMapper {

    List<TOrderEntity> list(TOrderEntity order);
}
