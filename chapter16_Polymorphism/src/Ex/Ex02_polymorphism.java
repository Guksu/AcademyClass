package Ex;

class Shape{
	public double calcArea() {
		return 0;
	}
	public void info() {}
	
}

class Rect extends Shape{
	int width, height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double calcArea() {
		return width*height;
	}
	@Override
	public void info() {
		System.out.println("width :"+ width);
		System.out.println("height :"+ height);
		System.out.println("크기는 :" + calcArea());
	}
}

class Triangle extends Shape{
	int width, height;
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double calcArea() {
		return (double)(width*height)/2;
	}
	@Override
	public void info() {
		System.out.println("width :"+ width);
		System.out.println("height :"+ height);
		System.out.println("크기는 :" + calcArea());
	}
}

class Circle extends Shape{
	int radius;
	
	public Circle(int radius) {
		this.radius =radius;
	}
	@Override
	public double calcArea() {
		return Math.PI*Math.pow(radius,2);//r의2제곱
	}
	@Override
	public void info() {
		System.out.println("radius :" + radius);
		System.out.println("크기는 :" + calcArea());
	}
}

public class Ex02_polymorphism {
	public static void main(String[] args) {
		Shape[] arr =new Shape[3];
		
		arr[0] = new Rect(10,20);
		arr[1] = new Triangle(30,30);
		arr[2] = new Circle(50);
		
		for(int i =0; i<arr.length; i++) {
			arr[i].info();
			System.out.println("===========");			
		}
	}
}
