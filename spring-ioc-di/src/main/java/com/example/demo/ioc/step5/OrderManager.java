package com.example.demo.ioc.step5;

import com.example.demo.ioc.step6.Car;
import com.example.demo.ioc.step6.CarMaker;
import com.example.demo.ioc.step6.Money;

public class OrderManager {

	CarMaker maker;

	//	public OderManager() {
	//		
	//	}

	public OrderManager(CarMaker maker) {
		super();
		this.maker = maker;
	}

	public void order() {

		System.out.println("OrderManager : order() called.");
		//HyundaiMaker maker = new HyundaiMaker();;

		Money money = new Money(2000);
		System.out.println("OrderManager : " + money.getAmount() + "원을 만든다.");

		Car car = maker.sell(money);
		System.out.println("OrderManager : 돈을주고" + car.getName() + "를 얻는다.");
	}

	public void setMaker(CarMaker maker) {
		this.maker = maker;
	}
}