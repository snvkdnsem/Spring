package com.example.demo.work;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@ToString
@Order(1)
@Qualifier("myService")
@Component
public class Service2 implements TheService {

	@Override
	public void work() {
		System.out.println("알린 ♡ 송수진");
		
	}
}
