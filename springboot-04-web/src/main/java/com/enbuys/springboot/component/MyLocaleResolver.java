package com.enbuys.springboot.component;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @Author: Pace
 * @Data: 2019/10/24 16:44
 * @Version: v1.0
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        // 判断请求中是否有leg参数，有便按参数进行国际化
        String leg = request.getParameter("leg");
        Locale locale = Locale.getDefault(); // 默认为操作系统语言
        if(!StringUtils.isEmpty(leg)){
            String[] split = leg.split("_");
            locale = new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
