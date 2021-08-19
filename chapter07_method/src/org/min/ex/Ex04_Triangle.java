package org.min.ex;

public class Ex04_Triangle {

	int width;
	int height;
	
	void setFields(int w , int h) {
		width = w;
		height = h;
	}
	
	
	// 메소드 명은 같으나, 매개변수가 다르지 않기 때문에 오버로딩 되지 않아서 오류가 난다.
	int calcArea() {
		return width*height/2;
	}
	
	double calcArea() {
		return width*height/2;
	}
}
