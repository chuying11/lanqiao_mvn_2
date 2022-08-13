package com.lanqiao.demo1;

import com.lanqiao.config.ComputerOtherConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ComputerOtherConfig.class);
        ComputerOtherPrinter computerOtherPrinter = context.getBean("computerOtherPrinter", ComputerOtherPrinter.class);
        computerOtherPrinter.work();

    }
}
