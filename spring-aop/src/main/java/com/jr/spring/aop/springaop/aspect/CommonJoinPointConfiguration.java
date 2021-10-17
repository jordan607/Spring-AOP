package com.jr.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;


public class CommonJoinPointConfiguration {

    @Pointcut("execution(* com.jr.spring.aop.springaop.data.*.*(..))")
    public void dataLayerExecution(){}
    @Pointcut("execution(* com.jr.spring.aop.springaop.buisness.*.*(..))")
    public void buisnessLayerExecution(){}
    @Pointcut("bean(*dao*)")
    public void beanContaningDao(){}
    @Pointcut("within(com.jr.spring.aop.springaop.buisness..*)")
    public void buisnessLayerExecutionWithin(){}
    @Pointcut("@annotation(com.jr.spring.aop.springaop.aspect.TrackTime)")
    public void trackTimeAnnotation(){}

}
