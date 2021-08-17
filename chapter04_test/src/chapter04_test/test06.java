package chapter04_test;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
		// Q. 1부터 입력 받은 양수 사이의 모든 정수의 합계 출력하기    입력 받은 수가 2이상이 아니면 다시 입력 받도록 처리

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하시오");
		int a = sc.nextInt();
		int b =0;

		if(a <2) {
			System.out.println("다시 입력하세요");
		}else {
			{for (int i =1; i<=a; i++) {
				b= b+i;
			}
			}
			System.out.println("1부터"+a+"의 합은"+b);
		}
		sc.close();
	}
}
