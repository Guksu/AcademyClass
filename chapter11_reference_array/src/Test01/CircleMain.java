package Test01;

import java.util.Scanner;

public class CircleMain {
	public static void main(String[] args) {

		//		Q1.
		//		Cricle.java 			- 필드 : double radius
		//								- 메소드 : Constructor, calcArea, output
		//		CricleMain.java			Circle 3개 생성 (반지름 입력 받아서 처리), 가장 크기가 큰 Circle 출력
		//		★
		//		calcArea => Math.PI * Math.pow(radius, 2)
		//		output => 반지름, 크기 출력

		Scanner sc = new Scanner(System.in);
		Circle[] c = new Circle[3];

		for(int i =0; i<c.length; i++) {
			System.out.println("반지름을 입력하시오");
			c[i] = new Circle(sc.nextDouble());			
		}
		
		double max = c[0].calcArea();
		int idx = 0;
		for(int i=0; i<c.length; i++) {
			if(max< c[i].calcArea()) {
				max = c[i].calcArea();
				idx = i;
			}
		}
		
		c[idx].output();
		sc.close();
	}
}
