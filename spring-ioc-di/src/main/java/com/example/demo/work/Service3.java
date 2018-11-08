package com.example.demo.work;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@Component
public class Service3 implements TheService {
	
	@Override
		public void work() {
		System.out.println("알린 ♡ 송수진");
			
		}

}