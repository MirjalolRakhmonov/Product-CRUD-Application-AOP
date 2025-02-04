package com.mirjalolcode.springdemo.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProductLoggingAspect {

	// setup logger
	private Logger myLogger=Logger.getLogger(getClass().getName());
	
	// set up pointcut declaration
	@Pointcut("execution(* com.mirjalolcode.springdemo.controller.*.*(..))")
	private void forControllerPackage() {}
	
	@Pointcut("execution(* com.mirjalolcode.springdemo.service.*.*(..))")
	private void forServicePackage() {}
	
	@Pointcut("execution(* com.mirjalolcode.springdemo.dao.*.*(..))")
	private void forDaoPackage() {}
	
	@Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
	public void forAppFlow() {}

	// add @Before advice
	@Before("forAppFlow()")
	public void before(JoinPoint theJoinPoint) {
		// display method we are calling
		String 	theMethod=theJoinPoint.getSignature().toShortString();
		myLogger.info("=====>> in @Before: calling: "+theMethod);
		
		// get the arguments
		Object[] args=theJoinPoint.getArgs();
		
		// loop through and display args
		for(Object tempArg : args) {
			myLogger.info("=====>> argument: "+tempArg);
		}
		
	}

	// add @AfterReturning advice
	@AfterReturning(pointcut = "forAppFlow()",
			returning = "theResult")
	public void afterReturning(JoinPoint theJoinPoint, Object theResult) {
		// display method we are calling
				String 	theMethod=theJoinPoint.getSignature().toShortString();
				myLogger.info("=====>> in @Before: calling: "+theMethod);
				
		// display data returned
	    myLogger.info("=====>> result: "+theResult);
	}
}
