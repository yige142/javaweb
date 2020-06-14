package cn.xyz.dao;
import cn.xyz.domain.User;

public interface UserDao {
    User findByUserName(String username);

    void save(User user);


}
