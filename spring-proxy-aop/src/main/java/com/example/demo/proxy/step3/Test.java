package com.example.demo.proxy.step3;

import java.lang.reflect.Proxy;

import org.hibernate.validator.internal.util.privilegedactions.GetClassLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Test { // client
	/*
	 * 빈 컨테이너에 HelloImpl 객체가 등록되었다면
	 * Client HelloImpl 객체를 주입받아서 사용하게 되고
	 * 핵심 로직만 수행될 것이다.
	 * 
	 * 빈 컨테이너에 Proxy객체가 등록되었다면 
	 * Client는 Proxy객체를 주입받아서 사용하게 되고
	 * 핵십 로직과 핵심로직 앞뒤로 부가로직도 같이 수행 될 것이다.
	 * 
	 * 결국, 빈 컨테이너 환경설정에서 Client가 사용할 로직을 
	 * 결정할 수 있다. 변화되는 부분을 클래스에서 추출하여 
	 * 빈 컨테이너 환경설정으로 처리할 수 있게 되었다.
	 */
	
	
	@Autowired
	private Hello hello;

	// 이렇게 쓸 경우 코드수정이 많아짐 
	public void order() {
		hello.say();
	}
	

	public static void main(String[] args) {

		Hello hello = new HelloImpl(); // Service 객체 
		
		hello.say(); 
		
		System.out.println();
		
//		Hello proxy = new Proxy(hello);
//		proxy.say();

		// 클래스 설계도 없이 동적으로 프록시 객체를 만들었다.
		// 이 기술은 JDK Dynamic Proxy 라고 부른다.
		// 스프링은 타켓 객체가 인터페이스를 구현하고 있다면
		// JDK Dynamic Proxy 기술을 사용하여 프록시 객체를 만든다.
		Hello proxy = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(), 
				new Class[] {Hello.class},
				new MyAdvice(hello));
		
		proxy.say();
	}

}
