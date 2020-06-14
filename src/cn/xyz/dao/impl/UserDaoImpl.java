package cn.xyz.dao.impl;

import cn.xyz.dao.UserDao;
import cn.xyz.domain.User;
import cn.xyz.druid.JDBCutils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;



public class UserDaoImpl implements UserDao {

    //1.获取JDBCTemplate对象
    JdbcTemplate template=new JdbcTemplate(JDBCutils.getDataSource());

    @Override
    public User findByUserName(String username) {
        User user=null;
        try {
            //定义sql
            String sql="select * from c_user where username=?";
            //执行sql
            user=template.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),username);
            System.out.println(user);

        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void save(User user) {
           //定义sql
        String sql="insert into c_user (id,username,password,sex,mobile,creatdate) values(?,?,?,?,?,?)";
        template.update(sql,null,
                user.getName(),
                user.getPassword(),
                user.getSex(),
                user.getMobile(),
                user.getCreatdate()
                );
    }


    //5查询数据将其封装为对象
    @Test
    public void test5(){
        String username="yige142";
        //定义sql
        String sql="select * from c_user where user=?";
        //执行sql
        User user=template.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),username);
        System.out.println(user);

    }


}
