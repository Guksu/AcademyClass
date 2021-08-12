package org.joonzis.test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
//		Test01.java
//		Q. 두 정수를 입력받아 a, b에 저장한 뒤 두 변수의 값을 교환하는 프로그램 구현
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자 입력 >> ");
		int a = sc.nextInt();
		
		System.out.println("두 번째 숫자 입력 >> ");
		int b = sc.nextInt();
		
		int tmp = a;	// 임시 변수 (a의 값을 저장 해두기 위함)
		
		a = b;
		b = tmp;
		
		System.out.println("a : " + a + ", b : " + b);
		sc.close();
		
		
		
		
		
	}
}
