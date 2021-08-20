package org.min.ex;

public class Ex00_Triangle {

	int width;
	int height;
	
	
	//생성자
	public Ex00_Triangle() {
		width = 1;
		height = 1;
	}
	
	public Ex00_Triangle(int w, int h) {
		width= w;
		height = h;
	}
	
	
	void output() {
		System.out.println("너비 :"+width);
		System.out.println("높이 :"+height);
		System.out.println("크기 :"+calcArea());
	}
	
	double calcArea() {
		return (double)width*height/2.0;
	}
}
