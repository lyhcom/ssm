package com.zking.mybatis01.mapper;

import com.zking.mybatis01.model.TStudentEntity;
import com.zking.mybatis01.vo.StudentVO;

import java.util.List;

/**
 * @author Administrator
 * @create 2019-11-0423:31
 */
public interface StudentMapper {

    int add(TStudentEntity student);

    int edit(TStudentEntity student);

    //int del(TStudentEntity student);

    TStudentEntity load(TStudentEntity student);

    List<TStudentEntity> list(StudentVO student);
}