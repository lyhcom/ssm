package com.zking.mybatis01.controller;

import com.zking.mybatis01.model.TStudentEntity;
import com.zking.mybatis01.service.StudentService;
import com.zking.mybatis01.util.DataProtocol;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RestControllerDemo {

    @Resource
    private StudentService studentService;

    @RequestMapping("/rest/loadStudent")
    public Object loadStudent(TStudentEntity student) {
        TStudentEntity stu = studentService.load(student);
        DataProtocol data = new DataProtocol();
        data.setCode(DataProtocol.SUCCESS);
        data.setData(stu);
        return data;
    }

    @RequestMapping("/rest/addStudent")
    public Object addStudent(@Validated(TStudentEntity.ValidataGroups.Add.class) TStudentEntity student, BindingResult bindingResult) {

        DataProtocol obj = new DataProtocol();
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            //获取所有的校验错误信息， 放入map中通过指定格式返回。
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError error : fieldErrors) {
                errors.put(error.getField(), error.getDefaultMessage());
            }
            obj.setCode(DataProtocol.FAIL);
            obj.setErrors(errors);
        } else {
            obj.setCode(DataProtocol.SUCCESS);
            obj.setMessage("操作成功");
        }

        return obj;
    }

}
