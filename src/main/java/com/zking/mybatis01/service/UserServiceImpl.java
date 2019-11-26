package com.zking.mybatis01.service;

import com.zking.mybatis01.mapper.UserMapper;
import com.zking.mybatis01.model.TSysUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @create 2019-11-2421:37
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public TSysUser load(String userName) {
        return userMapper.load(userName);
    }

}
