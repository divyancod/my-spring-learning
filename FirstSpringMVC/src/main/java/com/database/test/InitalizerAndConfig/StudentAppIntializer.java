package com.database.test.InitalizerAndConfig;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.FrameworkServlet;
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

    @Override
    protected FrameworkServlet createDispatcherServlet(WebApplicationContext servletAppContext) {
        DispatcherServlet servlet = new DispatcherServlet(servletAppContext);
        //for throwing no handler found exception
        servlet.setThrowExceptionIfNoHandlerFound(true);
        return servlet;
    }
}
