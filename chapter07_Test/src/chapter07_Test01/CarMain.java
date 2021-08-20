package chapter07_Test01;

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

public class CarMain {
	public static void main(String[] args) {

		Car calendar1 = new Car();
		Car calendar2 = new Car();
		
		calendar1.setFields("A+","red");
		calendar2.setFields("S+","green",2000);
		
		calendar1.output();
		System.out.println("==========");
		calendar2.output();
	}
}
