package com.zking.mybatis01.util;

import java.util.Locale;

/**
 * @author Administrator
 * @create 2019-11-1513:34
 */
public class LocalDemo {

    public static void main(String[] args) {

        //获取当前默认的区域设置，该设置由安装jdk时从操作系统获取
        System.out.println(Locale.getDefault());

        System.out.println(Locale.CHINA);
        System.out.println(Locale.US);
        System.out.println(Locale.JAPAN);
    }
}
