package chapter04_test;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
//		Q. 필기와 실기 점수를 입력 받아 합격 유무 출력하기
//		합격기준: 필기와 실기 점수 모두 70점 이상이거나, 평균이 80 이상시 "합격" 아니면 "불합격"

		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하시오");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		if ((a+b)/2 >=80 || (a>= 70&& b>=70)) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	sc.close();
	}
}
