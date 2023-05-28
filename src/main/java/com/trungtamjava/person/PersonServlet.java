package com.trungtamjava.person;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/add-person"})
public class PersonServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");

        PrintWriter printWriter = resp.getWriter();

        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String address = req.getParameter("address");

        printWriter.println(String.format("Name: %s, Age: %s, Address: %s", name, age, address));
    }
}
