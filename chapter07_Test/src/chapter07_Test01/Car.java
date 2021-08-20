package chapter07_Test01;

import java.util.Calendar;

//Q1. 
//클래스 Car 를 정의하시오.
//- 필드 : String model,String color, int year
//- 메소드 : setFields(model, color) : 올해를 year로 처리, 
//		 setFields(model, color, year),
//		 output()
//클래스 CarMain을 정의 하시오.
//★
//Calendar calendar = Calendar.getInstance();
//calendar.get(Calendar.YEAR);	 // 현재 년도

public class Car {

	String model, color;
	int year;
	Calendar calendar = Calendar.getInstance();
	
	void setFields(String model, String color) {
		this.model = model;
		this.color = color;
		this.year=calendar.get(Calendar.YEAR);
	}
	
	void  setFields(String model, String color, int year) {
		this.model =model;
		this.color = color;
		this.year = year;
	
	}
	void output() {
		System.out.println("model :" +model);
		System.out.println("color :" +color);
		System.out.println("year :"+ year);
		
	}
}
