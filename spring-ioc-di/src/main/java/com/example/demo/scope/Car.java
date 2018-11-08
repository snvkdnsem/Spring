package com.example.demo.scope;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.Data;

// 자료형이 같은 객체 다수가 빈 컨테이너에 존재 할 때.
// 처리순서를  지정한다. 낮은 숫자가 먼저 처리된다.
@Order(1)
@Component("car2")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Data
public class Car {
   public String name;
   public String maker;
   
   public Car() {
//	   this.name = "K7";
//	   this.maker = "Kia";
   }
   
   @PostConstruct
   public void init() {
	   if(name == null || maker == null) {
	   this.name = "K7";
	   this.maker = "Kia";
	   }
   }
}
