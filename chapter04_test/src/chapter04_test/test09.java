package chapter04_test;

import java.util.Scanner;

public class test09 {

	public static void main(String[] args) {
//		Q. 정수를 입력 받아 "짝수", "홀수" 구분해서 출력하기
//		   3의 배수는 "3의 배수"로 출력하기

		Scanner sc= new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int a = sc.nextInt();
		
		if (a%3 == 0) {
			System.out.println("3의 배수");
		}
		else if (a%2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	sc.close();
	}
}
