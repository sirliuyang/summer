/**
 * 
 */
package com.formula.summer.advice;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Leon(Liu Yang)
 * Ideas from Formula Innovation
 */
@Log4j2
@Aspect
@Component
public class LoggerAdvice {
	@Before("within(com.formula.service.*)" )
	public void addBeforeLogger(JoinPoint joinPoint){
		log.info("Start");
	}
}
