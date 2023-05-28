package com.trungtamjava;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/servlet-response"})
public class ServletResponseDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html");
        resp.setContentType("text/plain");
        resp.addCookie(new Cookie("a", "a"));
        resp.addHeader("a", "aaa");

        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<h1>Xin chao trung tam java</h1>");

        resp.sendError(200);

        printWriter.close();
    }
}
