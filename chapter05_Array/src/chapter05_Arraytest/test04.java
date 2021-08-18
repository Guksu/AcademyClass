package chapter05_Arraytest;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		// Q. 길이가 5인 int형 배열 선언 후, 사용자로부터 콘솔입력 받아 해당 데이터 값을 모두 더해서 합을 출력하기 
		
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[5];
		int sum =0;
		
		System.out.println("숫자를 입력하세요");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			sum = arr[i]+sum;
		}
		System.out.println("합계는"+sum);
		sc.close();
	}
}
