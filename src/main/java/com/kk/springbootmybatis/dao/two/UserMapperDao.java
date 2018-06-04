package com.kk.springbootmybatis.dao.two;

import com.kk.springbootmybatis.domain.User;
import com.kk.springbootmybatis.parm.UserParm;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Mr.kk
 */
@Component
public interface UserMapperDao {

    //全查
    List<User> getAll();
    //根据id进行查询
    User getOne(Long id);
    //新增
    void insert(User user);
    //修改
    void update(User user);
    //删除
    void delete(Long id);
    //分页查询user
    List<User> getList(UserParm userParm);
    //分页查询user的总数
    int getCount(UserParm userParm);
}
