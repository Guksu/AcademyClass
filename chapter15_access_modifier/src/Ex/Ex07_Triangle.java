package Ex;

public class Ex07_Triangle {

	private int width, height;
	
	public Ex07_Triangle() {
		this(1,1);
	}
	
	public Ex07_Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	private double calcArea() {
		return (double)(width*height)/2;
	}
	
	public void output() {
		System.out.println("가로 :" + width);
		System.out.println("세로 :" + height);
		System.out.println("크기 :" + calcArea());
	}
}
