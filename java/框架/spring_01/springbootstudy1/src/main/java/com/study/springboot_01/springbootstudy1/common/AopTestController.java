package com.study.springboot_01.springbootstudy1.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopTestController {
    private static final Logger logger = LoggerFactory.getLogger(AopTestController.class);
    ThreadLocal<Long> statTime = new ThreadLocal<>();
    @Pointcut(value = "execution(public String test (..))")
    public void cutOffPoint(){

    }

    /**
     * 在切入点之前执行
     */
    @Before("cutOffPoint()")
    public void beforeTest(){
        logger.info("我在test方法之前执行");
    }

    /**
     * 在切入点之后执行
     */
    @After("cutOffPoint()")
    public void doAfter(){
        logger.info("我在test之后执行");
    }

    /**
     * 环绕执行
     * @param point
     * @return
     */
    @Around("cutOffPoint()")
    public Object doAround(ProceedingJoinPoint point){
        statTime.set(System.currentTimeMillis());
        logger.info("我是环绕通知执行");
        Object object;
        try{
            object = point.proceed();
            logger.info("执行返回值："+object);
            logger.info(point.getSignature().getName()+"方法执行耗时: " + (System.currentTimeMillis() - statTime.get()));
        }catch (Throwable throwable){
            object = throwable.toString();
        }
        return object;
    }
    @AfterReturning("cutOffPoint()")
    public void doAfterRreturning() throws Throwable{
        logger.info("我是Afterreturning");
    }
    @AfterThrowing(throwing = "e",pointcut = "cutOffPoint()")
    public void doAfterReturning(Throwable e) {
        logger.info("大家好，我是@AfterThrowing，他们犯的错误，我来背锅");
        logger.info("错误信息"+e.getMessage());
    }
}
