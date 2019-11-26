package com.zking.mybatis01.service;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Administrator
 * @create 2019-11-2421:39
 */
//RunWith是个执行器，SpringJUnit4ClassRunner表示运行于spring测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//指定配置文件的位置，用于生成spring上下文
@ContextConfiguration(locations={"classpath*:applicationContext*.xml"})
public class BaseTest {
}
