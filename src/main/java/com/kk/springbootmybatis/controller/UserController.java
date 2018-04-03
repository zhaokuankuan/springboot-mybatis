package com.kk.springbootmybatis.controller;

import com.kk.springbootmybatis.common.Page;
import com.kk.springbootmybatis.dao.UserMapperDao;
import com.kk.springbootmybatis.dao.one.UserOneMapperDao;
import com.kk.springbootmybatis.dao.two.UserTwoMapperDao;
import com.kk.springbootmybatis.domain.User;
import com.kk.springbootmybatis.parm.UserParm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * @author Mr.kk
 */
@RestController
public class UserController {

    @Autowired
    private UserTwoMapperDao userTwoMapperDao2;

    @Autowired
    private UserOneMapperDao userTwoMapperDao1;

    //新增的方法
    @RequestMapping(value = "/addUser",method = {RequestMethod.GET,RequestMethod.POST})
    public Object addUser(User user, HttpServletRequest request, HttpServletResponse httpServletResponse){
        Map<String,Object> map = new HashMap<>();
        userTwoMapperDao1.insert(user);
        map.put("新增成功！",user.toString());
        return map;
    }

    //删除的方法
    @RequestMapping(value = "/deleteById",method = {RequestMethod.GET,RequestMethod.POST})
    public Object deleteById(long id){
        userTwoMapperDao1.delete(id);
        return "删除成功！";
    }

    //修改的方法
    @RequestMapping(value = "/updateUser",method = {RequestMethod.GET,RequestMethod.POST})
    public Object updateUser(User user){
        Map<String,Object> map = new HashMap<>();
        userTwoMapperDao1.update(user);
        map.put("修改成功！",user);
        return map;
    }

    //根据id查询user的方法
    @RequestMapping(value = "/getUserById",method = {RequestMethod.GET,RequestMethod.POST})
    public User getUserById(long id){
        User user = userTwoMapperDao2.getOne(id);
        return  user;
    }

    //全查所有的User
    @RequestMapping(value = "/getUserAll",method = {RequestMethod.POST,RequestMethod.GET})
    public List<User> getUserAll(){
        List<User>  list = userTwoMapperDao2.getAll();
        return  list;
    }


    @RequestMapping("/getList")
    public Page<User> getList(UserParm userParam) {
        List<User> users=userTwoMapperDao2.getList(userParam);
        long count=userTwoMapperDao2.getCount(userParam);
        Page page = new Page(userParam,count,users);
        return page;
    }
}
