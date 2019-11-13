package com.zking.mybatis01.service;

import com.zking.mybatis01.model.TStudentEntity;
import com.zking.mybatis01.util.PageBean;
import com.zking.mybatis01.vo.StudentVO;

import java.util.List;

/**
 * @author Administrator
 * @create 2019-11-0513:39
 */
public interface StudentService {

    int add(TStudentEntity student);

    TStudentEntity load(TStudentEntity student);

    int edit(TStudentEntity student);

    List<TStudentEntity> list(StudentVO student);

    List<TStudentEntity> listPage(StudentVO studentVO, PageBean pageBean);

}
