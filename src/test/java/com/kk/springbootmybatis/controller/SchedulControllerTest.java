package com.kk.springbootmybatis.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author :Mr.kk
 * @date: 2018/4/12 - 15:40
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SchedulControllerTest {

   @Autowired
    private SchedulController schedulController;

    @Test
    public void process() {
        schedulController.process();
    }
}