package com.learn.servletstudy.config;


import com.learn.servletstudy.demo.MyHttpServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyHttpServletConfig {

    @Bean
    public ServletRegistrationBean<MyHttpServlet> myHttpServlet(){
        return new ServletRegistrationBean<>(new MyHttpServlet(), "/http");
    }
}
