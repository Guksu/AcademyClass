package Ex;

interface Shape{
	double PI= 3.141592;
	double calcArea();
	void output();
}

class Rect implements Shape{
	private int width, height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calcArea() {
		return width*height*PI;
	}
	
	@Override
	public void output() {
		System.out.println("width: "+ width);
		System.out.println("height: "+ height);
		System.out.println("calcAraa: "+ calcArea());
	}
}

class Circle implements Shape{
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calcArea() {
		return PI*radius*radius;
	}
	@Override
	public void output() {
		System.out.println("radius: "+ radius);
		System.out.println("calcAraa: "+ calcArea());
	}
}
public class Ex02_Interface {
	public static void main(String[] args) {

		Rect rect = new Rect(100, 150);
		Circle circle = new Circle(25);
		
		rect.output();
		System.out.println("==========");
		circle.output();
	}
}
