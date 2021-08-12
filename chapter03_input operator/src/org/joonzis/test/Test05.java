package org.joonzis.test;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
//		Test05.java
//		Q. 1 - 국어,영어,수학 점수를 입력받아
//		   2 - 평균 출력하기 
//		3 - 평균값이 90이상이면 'A", 80이상이면 'B', 70이상이면 'C', 60이상이면 'D', 이하는 'F'
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 >> ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 >> ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 >> ");
		int mat = sc.nextInt();
		
		double avg = (kor+eng+mat) / 3.0;

		char grade = (avg>=90) ? 'A' : 
						(avg>=80) ? 'B' :
							(avg>=70) ? 'C' :
								(avg>=60) ? 'D' : 'F';
		
		System.out.println("평균 점수 : " + avg + " 학점 : " + grade);
	}
}
