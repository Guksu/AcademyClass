package Test04;

public class Circle {

	Coordinate cod;
	double radius;
	
	public Circle(double radius, Coordinate cod) {
		this.radius = radius;
		this.cod = cod;
	}
		
	void output() {
		cod.output();
		System.out.println("반지름 :"+ radius);
	}

}
