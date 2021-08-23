package Test04;

public class CoordinateCircleRingMain {

	public static void main(String[] args) {
//		Q4.
//		Coordinate.java			필드 - int x, int y
//								메소드 - Constructor, output
//		Circle.java				필드 - Coordinate center, double radius
//								메소드 - Constructor, output
//		Ring.java				필드 - Circle inner, Circle outer
//								메소드 - Constructor, output
//		CoordinateCircleRingMain.java	

		Ring ring = new Ring( new Circle(200, new Coordinate(2, 4)) , 
								new Circle(400, new Coordinate(2, 4)));
		
		ring.output();
	}
}
