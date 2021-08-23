package Test01;

public class CarMain {
	public static void main(String[] args) {
//		Q1.
//		Car.java		필드 -String model, String color, int year, booleans isNewCar
//						메소드 - Constructor, output
//		CarMain.java
//		★
//		생성자(모델, 색상, 연식) / 생성자(모델, 색상)
//		Calendar calendar = Calendar.getInstance();
//		calendar.get(Calendar.YEAR);

		
		Car car1 = new Car("First", "Red", 2021);
		Car car2 = new Car("Second", "blue", 1999);
		
		car1.output();
		System.out.println("==========");
		car2.output();
	}
}
