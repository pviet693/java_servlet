package com.trungtamjava.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/login"})
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<form action='/login' method='post'>");
        printWriter.println("<label for='username'>Username: </label>");
        printWriter.println("<input type='text' name='username' />");
        printWriter.println("<label for='password'>Password: </label>");
        printWriter.println("<input type='password' name='password' />");
        printWriter.println("<input type='submit' value='Login' />");
        printWriter.println("</form>");

        printWriter.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (username.equals("Viet") && password.equals("123456")) {
            Cookie cookie = new Cookie("username", username);
            cookie.setMaxAge(30);
            resp.addCookie(cookie);
            resp.sendRedirect("/welcome");
        } else {
            resp.sendRedirect("/login");
        }
    }
}
