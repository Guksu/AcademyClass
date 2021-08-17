package chapter04_test;

import java.util.Scanner;

public class test17 {

	public static void main(String[] args) {
		//		Q. 월을 입력 받아 일을 출력하기
		//		실행 예)
		//		월 입력 >> 10
		//		출력 : 10월은 31일 까지 있습니다.
		//		1 3 5 7 8 10 12 == 31일
		//		4 6 9 11 == 30일
		//		2 == 28일

		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하시오");
		int month = sc.nextInt();

		switch(month) {
		case 2 : System.out.println(month+ "월은 28일 까지 있습니다.");
			break;
		case 4 : case 6 : case 9 : case 11 : 
			System.out.println(month+ "월은 30일 까지 있습니다.");
			break;
		case 1 :case 3 :case 5: case  7 : case  8 :case 10 :case 12 :	
			System.out.println(month+ "월은 31일 까지 있습니다.");
			break;
		default : System.out.println("다시 입력하세요");		
		}
		sc.close();
	}
}
