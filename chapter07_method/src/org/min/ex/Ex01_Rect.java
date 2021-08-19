package org.min.ex;

public class Ex01_Rect {

	int width, height;
	boolean isSquare;  //정사각형이면 true
	
	void setFields(int w, int h){
		width =w;
		height = h;
		isSquare = (w == h) ? true : false;
	}
	//이게 오버로딩 /// 만약 아래의 메소드에 매개변수가 int타입으로 2개면 오류가 뜬다.
	void setFirelds(int side) {
		width = side;
		height = side;
		isSquare = true;
	}
	
	int calcArea(){
		return width * height;
	}
	
	void output() {
		System.out.println("너비 :"+width);
		System.out.println("높이 :"+height);
		System.out.println("크기 :"+calcArea());
		System.out.println(isSquare? "정사각형" : "직사각형");
	}
}
