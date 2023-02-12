package com.jsk.serivces.Impl;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Aspect
public class userMoneyProxy {
    @Pointcut("execution (* com.jsk.mappers.userMoneyMapper.insertList(..))")
    public void pointcut(){};
    @Before("pointcut()")
    public void beforeAdvice(){
        System.out.println("前置通知");
    }
    @AfterReturning("pointcut()")
    public void afterReturningAdvice(){
        System.out.println("后置通知");
    }
    @AfterThrowing("pointcut()")
    public void aVoid(){
        System.out.println("插入失败");
    }
}
