package com.lanqiao.demo1;

import org.springframework.stereotype.Component;

@Component("a5")
public class A5 implements Paper {

    @Override
    public void writer() {
        System.out.println("A5在工作");
    }
}
