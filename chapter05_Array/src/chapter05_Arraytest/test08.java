package chapter05_Arraytest;

import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
//		// Q. 성적 관리 프로그램 
//		5명의 int형 점수를 저장하는 scores 배열을 선언하고, 점수를 입력받아 최대, 최소, 평균 점수를 출력하기
//		String형 배열 names를 선언하고, 학생 5명의 이름을 초기화 한 뒤 활용
//		실행 예)
//		바트의 점수 입력 >> 70
//		리사의 점수 입력 >> 100

		Scanner sc = new Scanner(System.in);

		int[] score = new int[5];
		String[] names = {"김","이","박","성","유"};
		int grade =0;
		int maxGrade =score[0];
		int minGrade = score[0];

		for(int i = 0; i<names.length; i++) {
			System.out.println(names+"의 점수를 입력하세요");
			score[i] =sc.nextInt();
			grade = score[i]+grade;

			if(score[0]<score[i]) {
				maxGrade =score[i];
			}
			if(score[0]>=score[i]) {
				minGrade = score[i];
			}
		}

		int avgGrade = grade/5;

		System.out.println("최대 점수는"+maxGrade);
		System.out.println("최소 점수는"+minGrade);
		System.out.println("평균 점수는"+avgGrade);
		sc.close();
	}
}
