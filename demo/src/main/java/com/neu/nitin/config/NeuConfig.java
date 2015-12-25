package com.neu.nitin.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class NeuConfig extends WebMvcAutoConfigurationAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(NeuConfig.class);

    public void addViewControllers(ViewControllerRegistry registry) {
        LOGGER.info("VIEW CONTROLLER CONFIGURATION");
        registry.addViewController("/home").setViewName("index");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/403").setViewName("403");
        registry.addViewController("/error").setViewName("error");

    }

    @Bean(name = "dataSource")
    public DriverManagerDataSource dataSource() {
        LOGGER.info("DATA SOURCE CONFIGURATION");
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/neu_db");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root");
        return driverManagerDataSource;

    }

    /*public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/templates");
        resolver.setSuffix(".htm");
        return resolver;
    }*/

}
