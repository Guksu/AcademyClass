package chapter05_Array;

import java.util.Arrays;

public class Ex01_primitive_array {
	public static void main(String[] args) {

//     int [] arr =  new int[3];  길이가 3인 배열 생성(선언)
//		int [] arr = {10,20,30};  초기화 방법
	
		int[] arr1 = new int [3];
		System.out.println(Arrays.toString(arr1));  //모든 배열을 한번에 보는 방법
	
		int[] arr2 = {10,20,30};
		for( int i = 0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}
