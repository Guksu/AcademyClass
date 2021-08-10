package org.min.ex;

public class Ex02_Variable_boundary {
	
	static double PI= 3.14; //전역변수
	
	public static void main(String[] args) {
		//지역변수
		int value = 10;
		int sum = value +20;
		
		System.out.println(sum);
		System.out.println(sum + PI);
		//System.out.println(result);  이 변수는 사용불가
	}
	
	public void local() {
		//지역변수
		int result = 100;
	}
}
				//지역변수가 전역변수보다 메모리 할당이 적다