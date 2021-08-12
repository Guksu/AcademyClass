package org.joonzis.test;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
//		Test06.java
//		Q. 하이픈 없이 주민등록번호를 입력받아 (정수, 문자열) "남자","여자" 출력하기
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("주민등록번호 입력 >> ");
//		String num = sc.next();	// 1234561234567
//		
//		//String gender = (num.substring(6, 7).equals("1")) ? "남자" : "여자";
//		String gender = (num.charAt(6)=='1') ? "남자" : "여자";
//		
//		System.out.println("성별 : " + gender);
		
		
		
		System.out.print("주민등록번호 입력 >> ");
		double sn = sc.nextDouble(); // 1234561234567
		
		System.out.println(sn / 1000000);
		System.out.println(sn / 1000000 / 10);
		System.out.println(sn / 1000000 % 10 );
		
		double genderNum = sn / 1000000 % 10;
		
		
		String gender = (int)genderNum % 2 == 1 ? "남자" : "여자";
		System.out.println(gender);
		
		
		
		
		
		
		
		//System.out.println("성별 : " + gender);
		

	}

}
