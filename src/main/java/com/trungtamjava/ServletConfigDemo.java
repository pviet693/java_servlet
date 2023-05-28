package com.trungtamjava;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(urlPatterns = {"/servlet-config"}, initParams = {
//        @WebInitParam(name = "name", value = "Vietvippro")
//})
public class ServletConfigDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = super.getServletConfig().getInitParameter("name");

        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();

        printWriter.println(String.format("<h1>%s</h1>", name));
        printWriter.println(super.getServletConfig().getServletName());

        printWriter.close();
    }
}
