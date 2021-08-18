package chapter05_Arraytest;

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		// Q. int[] arr = {13, 22, -3, 92, 55, 5}
		//배열에서 값을 바꾸고 싶은 인덱스 2개를 선택하여
		//서로 값을 바꾸어 값들을 출력

		Scanner sc = new Scanner(System.in);
		
		int[] arr = {13, 22, -3, 92, 55, 5};		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c =0;
		
		c = arr[a];
		arr[a] = arr[b];
		arr[b] = c;
		System.out.println(arr[a]);
		System.out.println(arr[b]);
	
		sc.close();
	}
}
