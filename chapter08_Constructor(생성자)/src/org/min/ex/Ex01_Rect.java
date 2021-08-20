package org.min.ex;

public class Ex01_Rect {
	int width;
	int height;
	boolean isSquare;
	
	public Ex01_Rect() {
		width =1;
		height =1;
		isSquare =true;
	}
	
	public Ex01_Rect(int side) {
		width =side;
		height =side;
		isSquare =true;
	}
	
	public Ex01_Rect(int w, int h) {
		width =w;
		height =h;
		isSquare = (w == h) ? true : false;
	}

	int calcArea() {
		return width*height;
	}
	void output() {
		System.out.println("너비 :"+ width);
		System.out.println("높이 :"+ height);
		System.out.println("크키 :"+ calcArea());
		if(isSquare==true) {
			System.out.println("형태 : 정사각형");
		}else {
			System.out.println("형태 : 직사각형");
		}
	}
}
