package cn.xyz.web.severltb;

import cn.xyz.Utils.MD5Util;

import cn.xyz.dao.UserDao;
import cn.xyz.dao.impl.UserDaoImpl;
import cn.xyz.druid.JDBCutils;
import cn.xyz.web.filter.CharchatFilter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.xyz.domain.User;
import cn.xyz.servic.UserService;
import cn.xyz.servic.impl.UserServiceImpl;
import java.io.IOException;



@WebServlet("/RegistUserServlet/*")//注解 URL通过WebDemo2 找到对应的类
public class RegistUserServlet extends HttpServlet {
    CharchatFilter c=new CharchatFilter();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // String method=req.getMethod(); 获取提交过来的方式类型  get post
        //req.setCharacterEncoding("utf-8");
        String query=req.getQueryString();
        System.out.println(query);

        String name=req.getParameter("name");
        String pass=req.getParameter("password");
        String sex=req.getParameter("sex");
        System.out.println(name);
        System.out.println(pass);
        System.out.println(sex);


    }

    protected void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // req.setCharacterEncoding("utf-8"); //设置参数编码 避免中午显示乱码   (Fielter 已加载 可以省略)
        // String query=req.getQueryString();

        //测试输出post方法名 post
        // String method=req.getMethod();
        // System.out.print ln(method);

        //怎么获取map里想要的值（待处理）
//        Map aa=req.getParameterMap();
//        System.out.println(req.getParameterMap());



        //获取http提交过来的数据
        String name=req.getParameter("name");
        //MD5加密密码
        String pass=MD5Util.string2MD5(req.getParameter("password"));
        String sex=req.getParameter("sex");
        String mobile=req.getParameter("mobile");
        String creatdate=Long.toString(System.currentTimeMillis());

        //把提交过来的数据封装到User对象中
        User user = new User();
        user.setId(null);
        user.setName(name);
        user.setPassword(pass);
        user.setMobile(mobile);
        user.setSex(sex);
        user.setCreatdate(creatdate);

        //调用service 完成注册
        UserService serv=new UserServiceImpl();
        boolean flag=serv.register(user);



        resp.setContentType("text/html;charset=utf-8");
        //响应前端结果
        if(flag){
            //注册成功
            resp.getWriter().write("注册成功");
        }else{
            //注册失败
            resp.getWriter().write("注册失败");
        }

        System.out.println("======");
        System.out.println(name);
        System.out.println(pass);
        System.out.println(sex);
        System.out.println(creatdate);
        System.out.println(user);


    }


//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       // req.setCharacterEncoding("utf-8"); //设置参数编码 避免中午显示乱码   (Fielter 已加载 可以省略)
//       // String query=req.getQueryString();
//
//        //测试输出post方法名 post
//       // String method=req.getMethod();
//       // System.out.print ln(method);
//
//        //怎么获取map里想要的值（待处理）
////        Map aa=req.getParameterMap();
////        System.out.println(req.getParameterMap());
//
//
//
//        //获取http提交过来的数据
//        String name=req.getParameter("name");
//        //MD5加密密码
//        String pass=MD5Util.string2MD5(req.getParameter("password"));
//        String sex=req.getParameter("sex");
//        String mobile=req.getParameter("mobile");
//        String creatdate=Long.toString(System.currentTimeMillis());
//
//        //把提交过来的数据封装到User对象中
//        User user = new User();
//        user.setId(null);
//        user.setName(name);
//        user.setPassword(pass);
//        user.setMobile(mobile);
//        user.setSex(sex);
//        user.setCreatdate(creatdate);
//
//        //调用service 完成注册
//        UserService serv=new UserServiceImpl();
//        boolean flag=serv.register(user);
//
//
//
//        resp.setContentType("text/html;charset=utf-8");
//        //响应前端结果
//        if(flag){
//             //注册成功
//            resp.getWriter().write("注册成功");
//        }else{
//            //注册失败
//            resp.getWriter().write("注册失败");
//        }
//
//        System.out.println("======");
//        System.out.println(name);
//        System.out.println(pass);
//        System.out.println(sex);
//        System.out.println(creatdate);
//        System.out.println(user);
//
//
//    }
}
