package com.zking.mybatis01.controller;

import com.zking.mybatis01.model.TStudentEntity;
import com.zking.mybatis01.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @author Administrator
 * @create 2019-11-1415:24
 */
@Controller
@RequestMapping("/students")
public class StudentController {

    /**
     * 在add方法前调用，用于获取年级列表，以便于页面显示
     *
     * 注意：
     * 被@ModelAttribute注解的方法会在Controller每个方法执行之前都执行
     * 如果controller中包含多个请求url的需要慎用。
     *
     * @param model
     */
    @ModelAttribute
    public void getGrades(Model model) {
        System.out.println("---- getGrades");
        List<String> grades = Arrays.asList("一年级", "二年级", "三年级", "四年级", "五年级", "六年级");
        //放入model以便于页面使用
        model.addAttribute("grades", grades);
    }

    //@ModelAttribute
    //public void getStudent(Model model) {
    // model.addAttribute("student", new TStudentEntity());
    //}

    @RequestMapping("/addPage")
    public String addPage(Model model) {
        System.out.println("--------------------------");

        //必须加入句，作用是给springmvc的form标签提供数据，否则会报异常
        model.addAttribute("student", new TStudentEntity());
        return "addstu";
    }


    @RequestMapping("/add")
    public String add(TStudentEntity student, BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            return "addstu";
        }
        studentService.add(student);
        return "index";
    }


    @RequestMapping("/update")
    public String update(TStudentEntity student, BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            return "updatastu";
        }

        studentService.edit(student);
        System.out.println(student);

        return "index";
    }

    @Resource
    private StudentService studentService;


    /**
     * 获取指定的学员信息，进入转发到修改页面
     * @param student 该参数用于接收请求传过来的参数
     * @param model 该参数用于为页面传值，修改页面的form表单通过modelAttribute属性接收值
     * @return 定义转发到的页面
     */
    @RequestMapping("/updatePage")
    public String updatePage(TStudentEntity student, Model model) {
        TStudentEntity stu = studentService.load(student);
        model.addAttribute("student", stu);
        return "updatastu";
    }

}
