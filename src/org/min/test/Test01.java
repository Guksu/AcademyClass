package org.min.test;

public class Test01 {
	public static void main(String[] args) {
		//Q. 두 정수를 입력받아 a, b에 저장한 뒤 두 변수의 값을 교환하는 프로그램 구현

		int a = 10;
		int b = 20;
		
		int c = a;
		int d = b;
		
		a = d;
		b = c;
		System.out.println(a);
	}
}
