package org.min.test;
//		Q1. 
//		클래스 Circle
//		- 필드 : radius, PI, name
//		- 메소드 : info

//		클래스 CircleMain
//		- 메소드 : main
//		값을 대입해서 
//		반지름, 이름, 크기(PI*R*R), 둘레(2*PI*R) 값 출력


class Circle{
	double radius;
	double PI;
	String name;
	
	// !!!!!!중요사항 !!!!!
	//void는 return값이 없는 메소드
	//return값이 있는 메소드는 
	// 데이터타입(ex double) 메소드명(){return 리턴값};
	void info() {
		System.out.println("반지름 :" +radius);
		System.out.println("이름 :" + name);
		System.out.println("크기 :"+ Math.round((PI*radius*radius)));
		System.out.println("둘레 :"+ Math.round((2*PI*radius)));
	}
}

public class test01 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.radius = 20.5;
		c.PI=Math.PI;
		c.name = "ball";
		c.info();
	}
}
