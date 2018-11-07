package com.example.demo.lombok.step1;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// 론복이 알아서 만들어준다

@RequiredArgsConstructor
// all 모든 멘버변수를 사용하라는뜻
@AllArgsConstructor
public class User {
	
	@NonNull int id;
	@NonNull String name;
	String email;
	
//	public User(int id, String name, String email) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.email = email;
//	}
	
//	public User(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	
//	}
	
	
}
