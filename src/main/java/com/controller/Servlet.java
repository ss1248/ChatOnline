package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        super.doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        response.setContentType("utf-8,charset=gb2312");
        response.setCharacterEncoding("gb2312");
        request.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        out.println("controller servlet用于接收用户请求，响应给客户端内容，重定向或转发");
        out.println("JSP 用于展示数据和提供我们操作的请求");
    }
}
