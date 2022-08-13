package com.lanqiao.config;

import com.lanqiao.demo1.A6;
import com.lanqiao.demo1.A7;
import com.lanqiao.demo1.ComputerOtherPrinter;
import com.lanqiao.demo1.Paper;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource(value = "classpath:application.properties")
@ComponentScans(value = {@ComponentScan( "com.lanqiao.aspect"),@ComponentScan("com.lanqiao.service")})
@EnableAspectJAutoProxy()
public class ComputerOtherConfig {
    @Bean
    @Primary
    public A6 a6(){
        return new A6();
    }

    @Bean

    public A7 a7(){
        return new A7();
    }
    @Bean
    public ComputerOtherPrinter computerOtherPrinter(Paper a){
        ComputerOtherPrinter computerOtherPrinter = new ComputerOtherPrinter();
        computerOtherPrinter.setPaper(a);
        return computerOtherPrinter;
    }

}
