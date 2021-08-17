package chapter04_test;

import java.util.Scanner;

public class test16 {

	public static void main(String[] args) {
		//		Q. 권한을 출력하기
		//		3 수준 : 실행, 쓰기, 읽기 / 2수준 : 쓰기, 읽기 / 1수준 : 읽기
		//		실행 예)
		//		수준입력 >> 3
		//		출력 : 실행, 쓰기, 읽기

		Scanner sc = new Scanner(System.in);
		System.out.println("수준을 입력하시오");

		int a = sc.nextInt();
//		if(a == 3) {
//			System.out.println("실행, 쓰기, 읽기");
//		}else if( a == 2) {
//			System.out.println("쓰기, 읽기");
//		}else if( a == 1) {
//			System.out.println("읽기");
//		}else {
//			System.out.println("다시 입력하세요");
//		}
	
		switch(a) {
		case 3 :	System.out.print("실행,");
		case 2 :	System.out.print("쓰기,");
		case 1 :	System.out.println("읽기");	break;
		default :	System.out.println("다시 입력하세요");
		}
		sc.close();	
	}
}
