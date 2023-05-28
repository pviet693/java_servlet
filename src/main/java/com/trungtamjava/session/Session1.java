package com.trungtamjava.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/session1"})
public class Session1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        session.setAttribute("name", "viet");
        Integer age = new Integer(28);
        session.setAttribute("age", age);

        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("Xin chao bro");
        printWriter.close();
    }
}
