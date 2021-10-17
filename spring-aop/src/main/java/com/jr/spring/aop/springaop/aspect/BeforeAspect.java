package com.jr.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.aspectj.lang.annotation.Aspect;

@Aspect     //Combination of advice and pointcut
@Configuration
public class BeforeAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //execution(* PACKAGE.*.*(..)) -> returnType packageName anyClass anyMethod anyParameters
    //execution(* PACKAGE..*.*(..)) -> intercepts all the calls "execution(* com.jr.spring.aop.springaop..*.*(..))"

    @Before(value = "com.jr.spring.aop.springaop.aspect.CommonJoinPointConfiguration.buisnessLayerExecution()")       //PointCut
    public void before(JoinPoint joinPoint){
        //Process of implementing Aop around your method is called Weaving and the framework is called Weaver
        //Here we can write authentication logic
        logger.info("intercepted a Method {}", joinPoint.getSignature());   //Advice -> logic
    }
}
