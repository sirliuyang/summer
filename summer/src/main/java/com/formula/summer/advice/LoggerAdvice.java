/**
 * 
 */
package com.formula.summer.advice;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Leon(Liu Yang)
 * Ideas from Formula Innovation
 */
@Aspect
@Component
public class LoggerAdvice {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Before("within(com.formula.service.*)" )
	public void addBeforeLogger(JoinPoint joinPoint){
		logger.info("Start");
	}
}
