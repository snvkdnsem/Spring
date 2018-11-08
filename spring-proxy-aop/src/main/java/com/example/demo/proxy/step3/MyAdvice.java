package com.example.demo.proxy.step3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 기존의 Proxy 클래스는 Hello 구현체만 프록싱 할 수 있었으나
// MyAdvice 어떠한 타겟 객체도 프록싱 할 수 있다.
public class MyAdvice implements InvocationHandler{

	// 어떠한 타켓 객체도 취급할 수 있도록 Object 자료형으롤 지칭한다.
	private Object target;
	
	public MyAdvice(Hello hello) {
		this.target = hello;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 타겟 객체의 핵심 로직 앞에서 수행하는 로직  = Before Advice
		System.out.println("----------------"); // 때때로 수행해야 하는 부가 로직 
		
	
		// 범용성을 확보하기 위해서는 특정자료형이 노출되면 안된다.
		// ((Hello)target).say();
		
		// 타켓 객체의 핵심로직을 호출한다.
		// 타겟객채안에 있는 메소드를 호출한다.
		
		// terget 객체안에 있는 Method 객체가 알고 있는
		// 메소드를 호출하면서 파라미터로 args를 전달한다.
		Object ret = method.invoke(target, args); // 위임(Delegation)
		
		// 타겟 객체의 핵심 로직 뒤에서 수행하는 로직 = After Advice
		
		System.out.println("================"); // 때때로 수행해야 하는 부가 로직 
		
		return ret;
	}

	

}
