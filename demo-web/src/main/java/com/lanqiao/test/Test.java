package com.lanqiao.test;

import com.lanqiao.config.ComputerOtherConfig;
import com.lanqiao.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ComputerOtherConfig.class);
        IUserService userServiceImpl = context.getBean("userServiceImpl", IUserService.class);

    }
}
