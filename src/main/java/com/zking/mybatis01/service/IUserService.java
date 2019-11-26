package com.zking.mybatis01.service;

import com.zking.mybatis01.model.TSysUser;

/**
 * @author Administrator
 * @create 2019-11-2421:36
 */
public interface IUserService {

    TSysUser load(String userName);
}
