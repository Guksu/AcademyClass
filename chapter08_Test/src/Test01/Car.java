package Test01;

import java.util.Calendar;

public class Car {
	
	String model , color;
	int year;
	boolean isNewCar;
	Calendar calendar = Calendar.getInstance();
			
	public Car(String model, String color, int year) {
		this.model = model;
		this.color = color;
		this.year = year;
		isNewCar = ( year == calendar.get(Calendar.YEAR)) ? true : false;
	}
	
	void output() {
		System.out.println("모델명 :"+ model);
		System.out.println("색상 :"+ color);
		System.out.println("연식 :"+ (isNewCar? "신상": year));
	}
	
}
