package org.joonzis.test;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
//		Test08.java
//		Q. 체질량 지수(BMI) = 몸무게(kg) / 키 (m) 제곱 
//		   BMI 25 이상이면 "과체중", 20 이상이면 "정상", 20 미만이면 "저체중"
		
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(System.in);
		
		// 몸무게 입력 받기
		System.out.println("몸무게 입력(kg) >> ");
		double weight = sc.nextDouble();
		
		// 키 입력 받기(cm) -> (m)로 변환
		System.out.println("키 입력(cm) >>");
		double height = sc.nextDouble();
		height = height / 100; // 180 -> 1.8
		
		double bmi = weight / (height * height);
		
		
		String overWeight = (bmi>=25) ? "과체중" : 
											(bmi>=20) ? "정상" : "저체중";
		
		
		System.out.println("체질량 지수 : " + bmi + " 체중 범위 : " + overWeight);
		
		sc.close();
		
		
		
	}
}
