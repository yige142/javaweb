package cn.xyz.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebFilter("/")
public class CharchatFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //将父接口转为子接口
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        //获取请求方法
        String method= request.getMethod();
        if(method.equalsIgnoreCase("post")){
            request.setCharacterEncoding("utf-8");
            System.out.println("post获取到");
        }
        if(method.equalsIgnoreCase("get")){
           System.out.println("get获取到22");
        }
        //处理响应乱码
        response.setContentType("text/html;charset = utf-8");
       // System.out.print("fitler中222");
        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
