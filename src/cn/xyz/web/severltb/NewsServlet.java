package cn.xyz.web.severltb;

import cn.xyz.Utils.MD5Util;
import cn.xyz.domain.User;
import cn.xyz.servic.UserService;
import cn.xyz.servic.impl.UserServiceImpl;
import cn.xyz.web.filter.CharchatFilter;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;



/*
* 通过BaseSeverlet分发 找到对应的方法
* */
@WebServlet("/NewsServlet/*")
public class NewsServlet extends BaseSeverlet {
    CharchatFilter c=new CharchatFilter();


       public  void index(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


           resp.sendRedirect("../admin/news/upload.jsp");
           resp.setContentType("text/html;charset=utf-8");
           resp.getWriter().write("sdfdsfdsf");
       // System.out.println("访问到");

    }





}
