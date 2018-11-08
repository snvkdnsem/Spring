package com.example.demo.proxy.step2;

import com.example.demo.proxy.step3.MyAdvice;

public class Proxy implements Hello {

private Hello hello;
	
	public Proxy(Hello hello) {
		this.hello = hello;
	}
	
	@Override
	public void say() {

		System.out.println("----------------"); // 때때로 수행해야 하는 부가 로직 
		
		// 로지기을 중복으로 갖고있는 것은 관리적으로 비효율적이므로 여기서 
		// 타켓 객체의 메소드를 호출하는 방식으로 대체 한다.
//		System.out.println("나는 수진이양♡");
		hello.say();
		
		System.out.println("================"); // 때때로 수행해야 하는 부가 로직 

	}

}
