package com.qfedu.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * projectName: Kadaba
 * author: 崔
 * time: 2020/10/19  15:46
 * description: 实现cros跨域访问
 */
@WebFilter("/*")
public class CROSFiler implements Filter {
    /**
     * 过滤器
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }
}
