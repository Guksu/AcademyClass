package org.joonzis.test;

public class Test03 {
	public static void main(String[] args) {
//		Test03.java
//		Q. 1 - 매출액과 등급("VIP","일반")을 입력받아   -> 스캐너로 입력
//		    2 - 등급이 "VIP"이면 매출액에서 20%를 할인하고  
//		"일반"이면 매출액에서 5%를 할인하는 프로그램 구현 -> 조건 연산자 (80%, 95%)
		
		int salesMoney = 100;
		String grade = "VIP";
		
		int resultMoney = (grade.equalsIgnoreCase("vip")) ? 
						(int)(salesMoney*0.8) : (int)(salesMoney*0.95) ;
						
		System.out.println("실 판매 금액 : " + resultMoney);
		
	}
}
