package com.example.demo.lombok.step1;

public class EmpTest {

	public static void main(String[] args) {
		Emp emp = new Emp(10, "Jonh", "Developer");
		
		System.out.println(emp.getEname());
		
		
		// 객체의 정보? 객체의 클래스및 정보
		System.out.println(emp.toString());
		// com.example.demo.lombok.step1.Emp@7852e922

		System.out.println(emp);
				
		/*
		 * com.example.demo.lombok.step1.Emp@7852e922
		 * 
		 * Emp 클래스에서 toString() 메소드를 재 정의한 후
		 * 
		 * @ToString 애노테이션으로 toString() 메소드를 재 정의한 후
		 * Emp(empno=10, ename=Jonh, job=Developer)
		 * */
	}
	
}
