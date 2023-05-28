package com.trungtamjava.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/cookie1"})
public class CookieDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<p>Xin chao cac ban</p>");

        Cookie cookie1 = new Cookie("name", "Viet");
        cookie1.setMaxAge(5);

        Cookie cookie2 = new Cookie("age", "25");
        cookie2.setMaxAge(10);

        resp.addCookie(cookie1);
        resp.addCookie(cookie2);

        printWriter.close();
    }
}
