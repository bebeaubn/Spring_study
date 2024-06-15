package com.korea.di.di4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Coding {

	//1.필드주입
	//@Autowired
	//Computer computer;
	
	Computer computer;
	
	//2.setter주입
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	//3.생성자주입
	public Coding(Computer computer) {
		this.computer = computer;
	}
	
	public Computer getComputer() {
		return computer;
	}
}
