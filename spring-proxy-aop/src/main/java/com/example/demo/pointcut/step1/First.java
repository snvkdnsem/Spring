package com.example.demo.pointcut.step1;

//잠재적인 타겟
public class First {
	public void one() {
		System.out.println("First # one()");
	}
	
	public void one2() {
		System.out.println("First # one2()");
	}
	
	public void two() {
		System.out.println("First # two()");
	}
	
	public int add(int a, int b) {
		System.out.println("First # add(int a, int b)");
		return a + b;
	}
}