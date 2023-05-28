package com.trungtamjava.servletcontext;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/context2"})
public class Context2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();


        String name = (String) getServletContext().getAttribute("name");
        String jdbc = (String) getServletContext().getInitParameter("jdbc");

        printWriter.println("Xin chao " + name + ", " + jdbc);
    }
}
