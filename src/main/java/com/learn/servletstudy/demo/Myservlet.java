package com.learn.servletstudy.demo;

import jakarta.servlet.*;

import java.io.IOException;

public class Myservlet implements Servlet {

    public Myservlet() {
        System.out.println("构造函数启动。。。");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("初始化函数启动。。。");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
        System.out.println("service方法正在被调用。。。");
        servletResponse.setContentType("text/html;charset=UTF-8");
        servletResponse.getWriter().write("<h1>Hello, this is MyServlet (implements)</h1>");
    }

    @Override
    public String getServletInfo() {
        return "MyServlet demo";
    }

    @Override
    public void destroy() {
        System.out.println("destroy函数启动，该servlet生命周期结束。。。");
    }
}
