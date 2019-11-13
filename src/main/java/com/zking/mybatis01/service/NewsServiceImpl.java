package com.zking.mybatis01.service;

import com.zking.mybatis01.mapper.NewMapper;
import com.zking.mybatis01.model.TNews;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @create 2019-11-1314:18
 */
@Service
public class NewsServiceImpl implements NewsService {

    @Resource
    private NewMapper newMapper;

    @Override
    public List<TNews> list(TNews news) {
        return newMapper.list(news);
    }

}
