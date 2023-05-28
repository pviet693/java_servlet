package com.trungtamjava.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(urlPatterns = {"/cookie1", "/cookie2"})
public class Logger implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 1");
        filterChain.doFilter(servletRequest, servletResponse);

        servletResponse.setContentType("text/plain");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
