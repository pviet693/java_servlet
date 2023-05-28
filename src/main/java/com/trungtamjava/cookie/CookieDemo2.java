package com.trungtamjava.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/cookie2"})
public class CookieDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();

        Cookie[] cookies = req.getCookies();

        for(Cookie cookie : cookies) {
            printWriter.println(cookie.getName() + ": " + cookie.getValue() + "<br/>");

            cookie.setMaxAge(0);
            resp.addCookie(cookie);
        }

        printWriter.close();
    }
}
