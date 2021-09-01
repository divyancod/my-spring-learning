package com.database.test;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentAppIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class[] classes = {StudentAppConfig.class};
        return classes;
    }

    @Override
    protected String[] getServletMappings() {
        String[] mapping = {"/"};
        return mapping;
    }
}
