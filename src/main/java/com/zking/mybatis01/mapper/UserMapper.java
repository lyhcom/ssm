package com.zking.mybatis01.mapper;

import com.zking.mybatis01.model.TSysUser;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 * @create 2019-11-2421:23
 */
public interface UserMapper {

    TSysUser load(@Param("userName") String userName);

}
