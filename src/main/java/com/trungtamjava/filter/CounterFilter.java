package com.trungtamjava.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;

import java.io.IOException;

@WebFilter(urlPatterns = {"/*"}, initParams = {
        @WebInitParam(name = "count", value = "100")
})
public class CounterFilter implements Filter {
    private int count = 0;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String c = filterConfig.getInitParameter("count");
        this.count = Integer.valueOf(c);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        count++;

        System.out.println(count);

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
