package chapter04_test;

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
//		Q. 문자를 하나 입력 받아 "대문자", "소문자", "아라비아 숫자", "일반 문자" 구분해서 출력하기
//	     아스키 코드표 참고

		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력하시오");
		char ch = sc.next().charAt(0);    //String은 char의 집합이므로  Scannser 을 출력 받으려면 문자열의 0번째 인덱스로 출력 받아야 한다.
		
		if (ch >='A' && ch <= 'Z') {
			System.out.println("대문자");
		}
		else if (ch >='a' && ch <= 'z') {
			System.out.println("소문자");
		}else if (ch >= 0 && ch <=9) {
			System.out.println("아라비아 숫자");
		}else {
			System.out.println("일반문자");
		}
		sc.close();
	}
}