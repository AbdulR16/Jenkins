package com.example.demo.advices;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Aspect
@Component
public class LoggingAdvices {
	
	@Before("execution(* com.example.demo.service.CurrencyCoverterService.*(..))")
	public void logInfo(JoinPoint jp) {
		
		System.out.println(jp.getSignature().getName()+":Called");
		Object[] args =jp.getArgs(); 
		
		System.out.println("Argument:="+ args[0]);
	}

}
