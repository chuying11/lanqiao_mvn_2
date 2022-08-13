package com.lanqiao.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SpringLogAspect {
    /**
     * 切点
     */
    @Pointcut("execution (* com.lanqiao.service.*..*(..))")
    public void pointCut(){

    }
    /**
     * 前置通知
     */
    @Before("pointCut()")
    public void before(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName()+"开始计时");
    }

}
