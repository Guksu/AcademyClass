package org.joonzis.ex;

public class Ex07_castingEx {
	public static void main(String[] args) {
		
		//1.줄 바꿈
		System.out.print(1);
		System.out.println(2);
		
		//2.숫자끼리 + 연산자 : 산술 연산자
		System.out.println(1+1);
		System.out.println(1.5+1);
	
		//3.문자끼리 + 연산자 : 연결 연산자
		System.out.println("Hello"+ "Java");
		
		//4.숫자와 문자열 + 연산자 : 연결 연산자// 모든 연산은 왼쪽부터 실행
		System.out.println(22 +24+"hello");
		System.out.println("hello" + 22 +24);
	}
}
