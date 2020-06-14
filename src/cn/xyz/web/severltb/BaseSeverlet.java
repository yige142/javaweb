package cn.xyz.web.severltb;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/** 根据路径方法名，分发到其命名的方法
 * @author xyz
 */
public class BaseSeverlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp){
      //System.out.println("basesvleet 的sevice方法执行了");

        //完成方法分发
        //1.获取请求路径
        String url=req.getRequestURI();
        System.out.println("请求url:"+ url);

        //2.获取名称
        String methodName= url.substring(url.lastIndexOf('/')+1);
        System.out.println(methodName);

        //3.获取方法对象method
        System.out.println("this信息:"+this);
        //谁调用我 我代表谁
        try {
            Method method=this.getClass().getMethod(methodName,HttpServletRequest.class,HttpServletResponse.class);
            method.invoke(this,req,resp);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
