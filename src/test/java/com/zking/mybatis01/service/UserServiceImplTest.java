package com.zking.mybatis01.service;

import com.zking.mybatis01.model.TSysUser;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author Administrator
 * @create 2019-11-2421:38
 */
public class UserServiceImplTest extends BaseTest {

    @Resource
    private IUserService userService;


    @Test
    public void load() {

        TSysUser user = userService.load("zhangsan");
        System.out.println(user);

    }
}