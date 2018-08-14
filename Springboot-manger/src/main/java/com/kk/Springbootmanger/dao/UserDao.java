package com.kk.Springbootmanger.dao;

import com.kk.Springbootmanger.domain.User;

import java.util.List;

/**
 * @author :Mr.kk
 * @date: 2018/8/14-9:44
 */
public interface UserDao {
    //全查
    List<User> getAll();
    //根据id进行查询
    User getOne(Long id);
}
