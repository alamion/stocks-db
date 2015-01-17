package com.github.alamion.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * Configurtions with Bean initialization should be mentioned here
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{
            WebConfig.class
        };
    }

    /**
     * Configurations of ViewResolver should be mentioned here
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
            WebConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};  //To change body of implemented methods use File | Settings | File Templates.
    }
}
