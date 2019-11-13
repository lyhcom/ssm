package com.zking.mybatis01.service;

import com.zking.mybatis01.model.TNews;

import java.util.List;

/**
 * @author Administrator
 * @create 2019-11-1314:18
 */
public interface NewsService {
    List<TNews> list(TNews news);
}
