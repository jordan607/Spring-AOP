package com.jr.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect     //Combination of advice and pointcut
@Configuration
public class AroundAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Around("com.jr.spring.aop.springaop.aspect.CommonJoinPointConfiguration.trackTimeAnnotation()")       //PointCut
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long timeTaken = System.currentTimeMillis()-startTime;
        logger.info("Time taken by {} is {}", joinPoint, timeTaken);   //Advice -> logic
    }
}
