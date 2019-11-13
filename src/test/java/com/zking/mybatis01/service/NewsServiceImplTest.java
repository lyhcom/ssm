package com.zking.mybatis01.service;

import com.zking.mybatis01.model.TCategory;
import com.zking.mybatis01.model.TNews;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @create 2019-11-1314:26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext*.xml"})
public class NewsServiceImplTest {

    @Resource
    private NewsService newsService;

    @Test
    public void list() {
        TNews n = new TNews();
        List<TNews> lst = newsService.list(n);
        for (TNews nn:  lst){
            System.out.println("========================================");
            System.out.println(nn);
            for(TCategory c: nn.getCategorys()) {
                System.out.println(c);
            }
        }
    }
}