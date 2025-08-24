package com.learn.servletstudy.config;


import com.learn.servletstudy.demo.Myservlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyServletConfig {

    @Bean
    public ServletRegistrationBean<Myservlet> myServlet(){
        // 把Mysernlet注册到路径 ===> /impl
        return new ServletRegistrationBean<>(new Myservlet(), "/impl");
    }

}
