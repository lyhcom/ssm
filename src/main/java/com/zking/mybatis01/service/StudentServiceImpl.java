package com.zking.mybatis01.service;

import com.zking.mybatis01.mapper.StudentMapper;
import com.zking.mybatis01.model.TStudentEntity;
import com.zking.mybatis01.util.PageBean;
import com.zking.mybatis01.vo.StudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int add(TStudentEntity student) {
        return studentMapper.add(student);
    }

    @Override
    public TStudentEntity load(TStudentEntity student) {
        return studentMapper.load(student);
    }

    @Override
    public int edit(TStudentEntity student) {
        return studentMapper.edit(student);
    }

    @Override
    public List<TStudentEntity> list(StudentVO student) {
        return studentMapper.list(student);
    }

    @Override
    public List<TStudentEntity> listPage(StudentVO studentVO, PageBean pageBean) {

        /*if(pageBean != null && pageBean.isPagination()) {
            //设置的分页参数最终是保持在线程绑定变量中的
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }*/

        //在分页查询时，返回的list不再是java.util.List，而是PageHelper封装的List
        //该list继承自java.util.List
        List<TStudentEntity> lst = studentMapper.list(studentVO);

        /*if(pageBean != null && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(lst);
            pageBean.setTotal(Long.valueOf(pageInfo.getTotal()).intValue());
        }*/

        return lst;
    }


}

