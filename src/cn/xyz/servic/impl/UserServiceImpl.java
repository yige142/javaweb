package cn.xyz.servic.impl;

import cn.xyz.dao.UserDao;
import cn.xyz.dao.impl.UserDaoImpl;
import cn.xyz.domain.User;
import cn.xyz.servic.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userdao=new UserDaoImpl();
     @Override
    public boolean register(User user) {
         //       //根据用户名查找用户信息
       User u=userdao.findByUserName(user.getName());
       if( u != null){
          //用户名存在，注册失败
           System.out.println("用户名存在");
           return  false;
       }else{
           System.out.println("用户名不存在");
           System.out.println(user);
       }
       //保存信息
         userdao.save(user);
        return true;

     };
}
