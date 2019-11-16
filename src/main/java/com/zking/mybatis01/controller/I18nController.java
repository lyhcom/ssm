package com.zking.mybatis01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpSession;
import java.util.Locale;

/**
 * @author Administrator
 * @create 2019-11-1615:07
 */
@Controller
public class I18nController {

    /**
     * 基于会话的国际化，是根据客户端传过来的语言代码及区域代码生成Locale对象，保存在session中，之后根据session保
     * 存的Locale对象进行国际化。
     * 切换语言的思路如下：
     * 1）获取当前session中保存的Locale对象
     * 2）判断Locale对象，如果Locale对象为CHINA，则将session中的对应属性设置为Locale.US，以完成中文到英文的切换
     * 3）同理，如果Locale对象不是CHINA，则将session中的对应属性设置为Locale.CHINA，以完成从英文到中文的切换
     */
    @RequestMapping("/i18n/change")
    public String change(HttpSession session) {

        Locale locale = (Locale) session.getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);
        if(Locale.CHINA.equals(locale)) {
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.US);
        } else {
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.CHINA);
        }

        //重定向到首页
        return "redirect:/";
    }

}
