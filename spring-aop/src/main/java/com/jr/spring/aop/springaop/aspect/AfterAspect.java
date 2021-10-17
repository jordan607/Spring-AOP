package com.jr.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect     //Combination of advice and pointcut
@Configuration
public class AfterAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @AfterReturning(
            value = "execution(* com.jr.spring.aop.springaop.buisness.*.*(..))",
            returning = "result"
    )       //PointCut
    public void afterReturning(JoinPoint joinPoint, Object result){
        logger.info("{} returned with value {}", joinPoint.getSignature(), result);   //Advice -> logic
    }

    @AfterThrowing(
            value = "execution(* com.jr.spring.aop.springaop.buisness.*.*(..))",
            throwing = "throwing"
    )
    public void afterThrowing(JoinPoint joinPoint, Object throwing){
        logger.info("{} throwing exception {}", joinPoint,throwing);
    }

    @After(value = "com.jr.spring.aop.springaop.aspect.CommonJoinPointConfiguration.dataLayerExecution()")
    public void after(JoinPoint joinPoint){
        logger.info("after execution of {}", joinPoint);
    }
}
