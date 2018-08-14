package com.kk.Springbootmanger.controller;

import com.kk.Springbootmanger.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author :zhaokk
 * @date: 2018/8/13 - 16:27
 */
@RestController
public class DemoController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello112233";
    }

    @RequestMapping(value = "/getById",method = {RequestMethod.GET,RequestMethod.POST})
    public  Object getById(HttpServletRequest request, HttpServletResponse response){
        return "Id";
    }

    @RequestMapping(value = "/getAll",method = {RequestMethod.GET,RequestMethod.POST})
    public Object getAll(){
        return userDao.getAll();
    }
}
