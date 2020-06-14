package cn.xyz.web.severltb;

import cn.xyz.Utils.MD5Util;
import cn.xyz.domain.User;
import cn.xyz.servic.UserService;
import cn.xyz.servic.impl.UserServiceImpl;
import cn.xyz.web.filter.CharchatFilter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/*
* 通过BaseSeverlet分发 找到对应的方法
* */
@WebServlet("/IndexServlet/*")
public class IndexServlet extends BaseSeverlet {
    CharchatFilter c=new CharchatFilter();


    //访问链接 http://localhost:8080/jweb3_war_exploded/IndexServlet/index
    public void index(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("<span>123</span>");
        System.out.println("访问到ddd");
    }


}
