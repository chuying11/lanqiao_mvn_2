package com.lanqiao.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        第一步：初始化配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        第二步：
        IMyService iMyService = context.getBean("myServiceImpl", IMyService.class);
//        第三步：
        iMyService.print();
    }
}
