package com.example.demo.proxy.step1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Test { // client
	@Autowired
	private Hello hello;

	// 이렇게 쓸 경우 코드수정이 많아짐 
	public void order() {
		// 매일 매일 다른 로직을 수행해야 한다면 코드의 변경을 불가피하다.
		// 이는 매우 나쁘다. 코드 수정이 필요한 클래스는 영원히 개발이 종료되지 않게 된다.
//		hello.say();
		((HelloImpl)hello).say2();
	}
	
	
	/*
	 * Client 가 Service가 가져야 할 로직을 갖고 있으면 SRP 원칙에 위반된다.
	 * 그래서 줄 긋는 로직을 서비스 역할의 객체로 옮겼다.
	 * 그랫더니, 항상 같은 로직을 제공하게 된다.
	 * - 클라이언트는 나는 수진이야 만 출력하거나 
	 * - 앞뒤로 줄을 그으면서 나는 수진이야를 출력하고 싶다.
	 * 어떻게 해결할까?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello hello = new HelloImpl(); // Service 객체 
		
		hello.say();
		
		System.out.println();
		
//		System.out.println("----------------");
		hello.say();
//		System.out.println("================");
		
		System.out.println();
		
		((HelloImpl)hello).say2();
	}

}
