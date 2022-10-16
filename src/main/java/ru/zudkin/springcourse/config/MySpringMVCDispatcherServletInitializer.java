package ru.zudkin.springcourse.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMVCDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class}; // указываем где находится спринг конфигурация
    }

    protected String[] getServletMappings() {
        return new String[] {"/"}; // <url-pattern>/</url-pattern>
    }
}

