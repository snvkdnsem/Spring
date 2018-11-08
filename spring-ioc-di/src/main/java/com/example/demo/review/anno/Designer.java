package com.example.demo.review.anno;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Qualifier("myService")
@Order(2)
@Component
public class Designer implements Employee{
	
	@Override
	public void work() {
		System.out.println("UI 화면을 디자인한다.");
	}
}
