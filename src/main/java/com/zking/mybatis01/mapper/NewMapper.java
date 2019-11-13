package com.zking.mybatis01.mapper;

import com.zking.mybatis01.model.TNews;

import java.util.List;

/**
 * @author Administrator
 * @create 2019-11-1314:10
 */
public interface NewMapper {

    List<TNews> list(TNews news);

}
