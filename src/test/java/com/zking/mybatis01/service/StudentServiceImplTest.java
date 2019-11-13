package com.zking.mybatis01.service;

import com.zking.mybatis01.model.TStudentEntity;
import com.zking.mybatis01.util.PageBean;
import com.zking.mybatis01.vo.StudentVO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;


/**
 * @author Administrator
 * @create 2019-11-0517:18
 */
//RunWith是个执行器，SpringJUnit4ClassRunner表示运行于spring测试环境
@RunWith(SpringJUnit4ClassRunner.class)

//指定配置文件的位置，用于生成spring上下文
@ContextConfiguration(locations={"classpath*:applicationContext*.xml"})
public class StudentServiceImplTest {

    //mybatis与spring集成后直接使用注解进行依赖注入
    @Autowired
    private StudentService studentService;

    //与spring继承后不再需要
    //private SqlSession session;

    @Before
    public void before() {
        //获取SqlSession
        /*session = MybatisSessionFactoryUtils.openSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        studentService.setStudentMapper(studentMapper);*/
    }

    //每个测试方法执行完成后执行事务提交方法
    /*@After
    public void after() {
        session.commit();
    }*/

    @Test
    public void add() {
        TStudentEntity stu = new TStudentEntity();
        stu.setSname("许志强");
        stu.setAge(22);
        stu.setRemark("勇敢坚强");
        int add = studentService.add(stu);
        System.out.println(add);
    }

    @Test
    public void load() {
        TStudentEntity stu = new TStudentEntity();
        stu.setSid(149);
        TStudentEntity s = studentService.load(stu);
        System.out.println(s);
    }

    @Test
    public void edit() {
        TStudentEntity stu = new TStudentEntity();
        stu.setSid(6);
        stu.setRemark("国民党爱国将领");
        int editRows = studentService.edit(stu);
        System.out.println(editRows);
    }

    @Test
    public void testList() {
        StudentVO stu = new StudentVO();
        List<Integer> sids = Arrays.asList(10,11,12,13);
        stu.setSids(sids);
        List<TStudentEntity> lst = studentService.list(stu);
        for(TStudentEntity s: lst) {
            System.out.println(s);
        }
        System.out.println("========================================");
        lst = studentService.list(stu);
        for(TStudentEntity s: lst) {
            System.out.println(s);
        }
    }

    @Test
    public void testListPage() {
        StudentVO stu = new StudentVO();
        PageBean pageBean = new PageBean();
        pageBean.setRows(3);
        List<TStudentEntity> lst = studentService.listPage(stu, pageBean);
        System.out.println(pageBean);
        for (TStudentEntity s: lst) {
            System.out.println(s);
        }
    }

}