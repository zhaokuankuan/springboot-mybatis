# springboot-mybatis
SpringBoot和mybatis的整合，提供一个脚手架，需要的时候直接down就可以了

1.配置了springboot的热部署
2.集成了mybatis
3.设置mybatis打印sql
4.基于xml的mybatis配置，还有基于注解的以后可以探讨下

  增加了spingboot自带的定时任务的工具Scheduled的使用：
    1.可以根据corn表达式进行定时任务的调度
    2.也可以使用fixedRate 来进行定时任务的调度
    
    
    @Scheduled(fixedRate = 6000) ：上一次开始执行时间点之后 6 秒再执行。
    @Scheduled(fixedDelay = 6000) ：上一次执行完毕时间点之后 6 秒再执行。
    @Scheduled(initialDelay=1000, fixedRate=6000) ：第一次延迟 1 秒后执行，之后按 fixedRate 的规则每 6 秒执行一次。
    
    
    