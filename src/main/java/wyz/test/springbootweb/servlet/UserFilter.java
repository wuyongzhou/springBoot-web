package wyz.test.springbootweb.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 表明当前类为servlet的filter过滤器
 */
@WebFilter("/user.do")
public class UserFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("test user filter");
        //若没有执行这句filterChain.doFilter(servletRequest,servletResponse);
        //页面会被拦截，相反，只要存在，页面正常显示
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
