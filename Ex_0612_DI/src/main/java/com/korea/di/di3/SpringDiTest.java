package com.korea.di.di3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDiTest {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext("com.korea.di.di3");
		
		Car car = (Car)ac.getBean(Car.class);
		Engine engine = (Engine)ac.getBean(Engine.class);
		Door door = (Door)ac.getBean(Door.class);
		
		car.engine = engine;
		car.door = door;
		
		System.out.println("car="+car);
		System.out.println("engine="+engine);
		System.out.println("door="+door);
		
		
		
		
		
		
		
		
		
	}
}
