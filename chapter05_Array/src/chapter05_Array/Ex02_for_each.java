package chapter05_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02_for_each {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];

		for(int i = 0; i<arr.length; i++) {
			System.out.println(i+1 +"번째 입력");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));

		//for each문
		for(int i :arr) {    //arr각 요소를 i라는 변수로 지정
			System.out.println(i);  //위에서 입력받은 i를 출력 // 배열에 직접 접근하는게 아니고 배열 요소의 값을 다른 변수로 받아서 처리한다.


			int[] arr2 = new int[3];
			for(int num :arr2) {
				System.out.println("입력하시오");
				num=sc.nextInt();
			}
			System.out.println(Arrays.toString(arr2));   //for문에서 입력받은 변수가 출력되지 않는 이유는 for each문은 arr 요소를 num에 넣어주는것이여서이다/ 출력을 위해선 arr에 요소를 넣어야 한다.
		}
		sc.close();
	}
}
