package com.example.demo.ioc.step6;

import org.springframework.stereotype.Component;

//<bean id="hyundaiMaker" class="com.example.demo.ioc.step6.HyundaiMaker"></bean>
//같은 클래스 안이므로 xml처럼 작성안하고 @Component("hyundaiMaker")이렇게만 작성해도 된다.
@Component("hyundaiMaker")
public class HyundaiMaker implements CarMaker {
	
	@Override
	public Car sell(Money money) {
		System.out.println("HyundaiMaker : sell(Money money) called.");
		
		System.out.println("HyundaiMaker : " + money.getAmount() + "원을 차 값으로 받는다.");
		
		Car car = new Car("Sonata");
		System.out.println("HyundaiMaker : " + car.getName() + "를 만들어 판다.");
		
		return car;
	}

}
