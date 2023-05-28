package com.trungtamjava.person;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/person-form"})
public class FormPerson extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<form action='/add-person' method='post'>");
        printWriter.println("<label for='name'>Name: </label>");
        printWriter.println("<input type='text' name='name' />");
        printWriter.println("<label for='age'>Age: </label>");
        printWriter.println("<input type='number' name='age' />");
        printWriter.println("<label for='address'>Address: </label>");
        printWriter.println("<textarea name='address'></textarea>");
        printWriter.println("<input type='submit' value='submit' />");
        printWriter.println("</form>");
    }
}
