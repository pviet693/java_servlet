package com.trungtamjava.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/session2"})
public class Session2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();

        String name = "";

        HttpSession httpSession = req.getSession();

        Object objName = httpSession.getAttribute("name");
        int age = (Integer) httpSession.getAttribute("age");
        if (objName != null) {
            name = String.valueOf(objName);
        } else {
            resp.sendRedirect("/session1");
        }

        printWriter.println("Xin chao " + name + ", Age: " + age);
        printWriter.close();
    }
}
