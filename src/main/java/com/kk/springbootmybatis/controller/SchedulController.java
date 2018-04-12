package com.kk.springbootmybatis.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author :Mr.kk
 * @date: 2018/4/12 - 15:37
 */
@Component
public class SchedulController {

    int count = 0;

    //间隔1s调用一次方法
    @Scheduled(cron="\"*/1 * * * * ?\"")
    public void process(){
        System.out.println(count++);
    }

    //固定时间周期执行
    @Scheduled(fixedRate = 1000)
    public void processTask(){
        System.out.println("task:"+ count++);
    }

}
