package com.example.demo.proxy.step1;

public class HelloImpl implements Hello {

	@Override
	public void say() {
		
		System.out.println("----------------");
		System.out.println("나는 수진이양♡");
		System.out.println("================");
	}
	
	// 이는 해결책이 안됨
	public void say2() {
		
		System.out.println("나는 수진이양♡");
	} 

}
