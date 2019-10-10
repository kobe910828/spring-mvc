package com.hx.servlet;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/10/10 9:03
 */
public class MyWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

//    @Override
//    protected Filter[] getServletFilters() {
//        return new Filter[]{new HelloWorldFilter()};
//    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
