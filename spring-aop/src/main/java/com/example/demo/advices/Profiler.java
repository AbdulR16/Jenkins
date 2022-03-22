package com.example.demo.advices;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Profiler {
	
	@Around("execution(* com.example.demo.service.CurrencyCoverterService.*(..))")
	public Object estimateTime(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("Before Calling Method"+pjp.getSignature().getName()+":Called");
		
		Object[] args =pjp.getArgs(); 
		
		System.out.println("Argument to the Method="+ args[0]);
		
		Object obj = pjp.proceed();
				
		System.out.println("Method Completed Result:="+obj);
		
		return obj;
	}
	

}
