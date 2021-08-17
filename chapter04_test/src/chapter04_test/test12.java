package chapter04_test;

import java.util.Scanner;

public class test12 {

	public static void main(String[] args) {
//		Q. 점수를 입력 받아 학점 출력하기
//		   100 ~ 97점 : A+ / 96 ~ 94점 : A0 / 93 ~ 90점 : A- 
//		    89 ~ 87점 : B+ / 86 ~ 84점 : B0 / 83 ~ 80점 : B-
//		    79 ~ 77점 : C+ / 76 ~ 74점 : C0 / 73 ~ 70점 : C- / 69 ~ 0점 : F
	
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하시오");
		
		int score = sc.nextInt();
		
		if(score>=97) {
			System.out.println("A+");
		}else if (score>=94) {
			System.out.println("A0");
		}
		else if (score>=90) {
			System.out.println("A-");
		}
		else if (score>=87) {
			System.out.println("B+");
		}
		else if (score>=84) {
			System.out.println("B0");
		}
		else if (score>=80) {
			System.out.println("B-");
		}
		else if (score>=77) {
			System.out.println("C+");
		}
		else if (score>=74) {
			System.out.println("C0");
		}
		else if (score>=70) {
			System.out.println("C-");
		}else {
			System.out.println("F");
		}
		
		sc.close();
	}
}
