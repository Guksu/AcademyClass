package Ex;

public class Ex05_Circle {

	private int x, y;
	private double radius;
	
	public Ex05_Circle() {
		this(0,0,1);
	}
	
	public Ex05_Circle(double radius) {
		this(0,0,radius);
	}
	
	public Ex05_Circle(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	private double calcCircum() {
		return 2*Math.PI*radius;
	}
	
	private double calcArea() {
		return Math.PI*radius*radius;
	}
	
	public void output() {
		System.out.println("좌표 :[" + x + ","+ y +"]");
		System.out.println("반지름 :" + radius);
		System.out.println("원의 둘레 :" + calcCircum());
		System.out.println("원의 크기 :" + calcArea());
	}
}
