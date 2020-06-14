package cn.xyz.web.severltb;

import cn.xyz.Utils.MD5Util;
import cn.xyz.domain.User;
import cn.xyz.servic.UserService;
import cn.xyz.servic.impl.UserServiceImpl;
import cn.xyz.web.filter.CharchatFilter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/test/*")//注解 URL通过WebDemo2 找到对应的类
public class TestSevlet extends BaseSeverlet {
    CharchatFilter c=new CharchatFilter();

    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         System.out.println("testsevleet中的add方法");
    }


    public void sdf(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         System.out.println("testsevleet中的sdf方法");
    }
}
