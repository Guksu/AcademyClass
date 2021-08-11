package org.min.test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//Q. 나이를 입력받아 "성인" 또는 "미성년자" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하시오 >>");
		if( sc.nextInt() >19) {
			System.out.println("성인");
		}
		else {
			System.out.println("미성년자");
		}
		sc.close();
		
	}
}
