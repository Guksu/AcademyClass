package org.min.test;

import java.util.Scanner;
//		Q2.
//		클래스 Rect
//		- 필드 : width, height
//		- 메소드 : init(너비, 높이 입력), info(너비, 높이 입력 출력), 
//		calcArea(w*h/2, 넓이계산 출력)

//		클래스 RectMain
//		- 메소드 : main
//		값을 입력 받아서 (Scanner) 확인

class Rect{

//      !!!!!!!!!!!!중요 !!!!!!!!!!!!!!
// main 에 Scanner를 임포트하고 r.init(sc)로 설정한 뒤
// class 파일에 init(Scanner(이건 데이터타입) 변수명){
// 					변수(변수명)}으로 메소드를 설정 할 수있다.
	
	Scanner sc = new Scanner(System.in);
	double width;
	double height;
	
	void init() {
		System.out.println("너비를 입력하세요 :" );
		width=sc.nextDouble();
		System.out.println("높이를 입력하세요 :");
		height=sc.nextDouble();
	}

	void info() {
		System.out.println("너비 :"+ width);
		System.out.println("높이 :"+ height);
		calcArea();
	}

	void calcArea() {
		System.out.println("넓이값은 :"+(width*height/2));
	}
}

public class test02 {

	public static void main(String[] args) {
		
		Rect r = new Rect();
		r.init();
		r.info();

	}
}




