package com.example.demo.ioc.step5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

   public static void main(String[] args) {
//      CarMaker maker = new KiaMaker(); // 객체생성, com.example.demo.ioc.step5의 test클래스 안에 있으므로 생략가능
//      CarMaker maker = new HyundaiMaker(); // 객체생성
//      
//      OrderManager manager = new OrderManager(); // 객체생성
//      manager.setMaker(maker); // 관계설정
//      manager.order(); // 로직호출
      
      /*
       * 스프링에게 객체생성, 관계설정을 위임하는 방법 3가지
       * 1. XML
       * 2. Annotation
       * 3. Java Configuration Class
       */
      
      ApplicationContext context = new ClassPathXmlApplicationContext("car-config.xml");
      
      OrderManager manager = (OrderManager) context.getBean("manager");//getBean : id가 manager인걸 달라는 얘기
      manager.order();
   }
}