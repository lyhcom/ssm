package com.zking.mybatis01.util;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Administrator
 * @create 2019-11-1611:30
 */
public class ResourceBundleDemo {

    public static void main(String[] args) {

        String path = "i18n";

        //如果只带path参数，则系统根据默认的区域设置来获取资源
        ResourceBundle r = ResourceBundle.getBundle(path);
        String name = r.getString("name");
        System.out.println(name);

        //如果指定Locale对象，则通过指定的Locale对象来获取资源
        ResourceBundle rr = ResourceBundle.getBundle(path, Locale.US);
        String name2 = rr.getString("name");
        System.out.println(name2);

        String msg = r.getString("message");
        msg = MessageFormat.format(msg, "露丝", "杰克");
        System.out.println(msg);

        String msg2 = rr.getString("message");
        msg2 = MessageFormat.format(msg2, "Rose", "Jeck");
        System.out.println(msg2);

    }
}
