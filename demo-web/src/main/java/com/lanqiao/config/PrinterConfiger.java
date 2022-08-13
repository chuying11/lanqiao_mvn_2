package com.lanqiao.config;

import com.lanqiao.demo1.A5;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 */
@Configuration
public class PrinterConfiger {
    @Bean
    public A5 a5(){
        return new A5();
    }
}
