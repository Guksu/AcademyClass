package chapter04_test;

import java.util.Scanner;

public class test15 {

	public static void main(String[] args) {
//		Q. 섭씨 / 화씨 변환기
//		   switch문 이용해서 구현하기
//		★화씨 = 섭씨 * 1.8 +32
//		  섭씨 = (화씨 -32) / 1.8
		
		Scanner sc = new Scanner(System.in);
		System.out.println("온도가 섭씨 혹은 화씨인지 입력하시오");
		String str = sc.nextLine();
		System.out.println("온도를 입력하시오");
		double a = sc.nextDouble();
		
		switch(str) {
		case "섭씨" :
			double num1 = (a*1.8)+32;
			System.out.println("현재 온도는 화씨 " +num1 +"입니다");
			break;
			
		case "화씨 ":
			double num2 = (a-32)/1.8;
			System.out.println("현재 온도는 섭씨" +num2 +"입니다");
			break;
		
		default : System.out.println("다시 입력하세요");
		}
	sc.close();
	}
}
