package cn.xyz.web.filter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/webdemo1")//注解 URL通过webdemo1 找到对应的类
public class webdemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // String method=req.getMethod(); 获取提交过来的方式类型  get post
        String query=req.getQueryString();
        System.out.println(query);
        System.out.println("收到get");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
