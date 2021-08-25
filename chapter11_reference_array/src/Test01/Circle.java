package Test01;

public class Circle {
	
	double radius;
	
	public Circle(){}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	double calcArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	void output() {
		System.out.println("반지름은 :"+ radius);
		System.out.println("원의 크기는 :"+ calcArea());
	}
}
