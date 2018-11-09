package com.example.demo.aop.xml.step4;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

// Aspect :
// 공통적인 부가로직(횡단관심사)을 어드바이스라고 하고
// 새로운 애스팩트(물리적으로는 클래스)를 열어서 다수의 어드바이스를 갖고 있는 것을 애스팩트라고 부른다.
@Component
public class MyAspect 
//implements MethodInterceptor, MethodBeforeAdvice
{

	//	@Override
	public void before(
			//			Method method, Object[] args, Object target
			JoinPoint joinPoint // 왼쪽의 코드는 문법이므로 그냥 외워라
			) throws Throwable {
		System.out.println("-----Before-----");
	}

	//	@Override
	public Object invoke(
			//			MethodInvocation invocation
			ProceedingJoinPoint joinPoint  // 왼쪽의 코드는 문법이므로 그냥 외워라
			) throws Throwable {
		System.out.println("-----Around Before Advice-----");
		
		// 타겟 메소드의 전달되는 파라미터를 조작할 수 있다.
		Object[] args = joinPoint.getArgs();
		if(args != null && args.length>0) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			Arrays.asList(args).forEach(System.out::println);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}

//		Object ret = invocation.proceed();
		// 타겟 메소드의 호출여부를 결정할 수 있다.
		Object ret = joinPoint.proceed(); // 이 코드에서 타겟 메소드를 호출한다.

		System.out.println("=====Around After Advice======");
		
		// 타겟 메소드가 리턴한 결과를 조작할 수 있다.
		ret = (Integer)ret + 100; 

		return ret;
	}

	public void myAfterReturning(JoinPoint joinPoint) {
		System.out.println("******myAfterReturning******");
	}

	public void myAfterThrowing(JoinPoint joinPoint) {
		System.out.println("******myAfterThrowing******");
	}

	public void myAfter(JoinPoint joinPoint) {
		System.out.println("******myAfter******");
	}

}
