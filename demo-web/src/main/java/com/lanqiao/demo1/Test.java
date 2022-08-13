package com.lanqiao.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context  =new ClassPathXmlApplicationContext("springIOC.xml");
        Printer printer = context.getBean("printer",Printer.class);
        System.out.println(printer);
        printer.working();

    }
}
