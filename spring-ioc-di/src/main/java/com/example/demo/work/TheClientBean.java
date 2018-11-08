package com.example.demo.work;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;




@Component
public class TheClientBean {
	@Autowired
	@Qualifier("myService")
	private List<TheService> list;
	
	public static void main(String[] args) {		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("service-config.xml");
		
		TheClientBean clientBean = (TheClientBean) context.getBean("theClientBean");
		clientBean.list.forEach(System.out::println);
		
	}
}
