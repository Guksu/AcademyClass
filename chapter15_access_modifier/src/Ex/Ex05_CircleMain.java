package Ex;

public class Ex05_CircleMain {
	public static void main(String[] args) {

		Ex05_Circle circle1 = new Ex05_Circle();
		Ex05_Circle circle2 = new Ex05_Circle(10);
		Ex05_Circle circle3 = new Ex05_Circle(10,10,100);

		circle1.output();
		System.out.println("=============================");
		circle2.output();
		System.out.println("=============================");
		circle3.output();
	}
}
