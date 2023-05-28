package com.trungtamjava;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(urlPatterns = {"/servlet-request"})
public class ServletRequestDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Request method: " + req.getMethod());
        System.out.println("Request content-type: " + req.getContentType());
        System.out.println("Request context path: " + req.getContextPath());
        System.out.println("Request cookies: " + req.getCookies());
        System.out.println("Request server name: " + req.getServerName());
        System.out.println("Request server port: " + req.getServerPort());

        Enumeration<String> keys = req.getHeaderNames();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();

            System.out.println(key + ": " + req.getHeader(key));
        }
    }
}
