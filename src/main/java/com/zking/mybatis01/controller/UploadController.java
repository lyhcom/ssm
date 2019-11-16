package com.zking.mybatis01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author Administrator
 * @create 2019-11-1622:11
 */
@Controller
public class UploadController {

    //获取项目配置文件的中的值（本例的配置project.properties中，如果没有项目配置文件可以新增一个）
    @Value("${uploadDir}")
    private String uploadDir;

    @RequestMapping("/uploadPage")
    public String uploadPage() {

        return "uploadPage";
    }


    @RequestMapping("/upload")
    public String upload(MultipartFile img) throws IOException {
        String path = uploadDir + File.separator+System.currentTimeMillis();
        File targetFile = new File(path);
        String fn = img.getOriginalFilename();
        System.out.println("上传的文件 = " + fn);
        img.transferTo(targetFile);
        return "redirect:/uploadPage";
    }

}
