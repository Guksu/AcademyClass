package Test;

import java.util.Arrays;

public class Test01<T> {
	@SuppressWarnings("unused")
	private T[] arr;
	public static <T> String checkType(T[] arr) {
		StringBuffer sb = new StringBuffer();
		sb.append("Type: ").append(arr.getClass().getSimpleName());
		return sb.toString();
	}

	public static <T> String toString(T[] arr) {
		return Arrays.toString(arr);
	}


	public static void main(String[] args) {
//		Q1. Test01.java
//		문자/정수/실수 타입의 배열을 전달하고 데이터 타입을 체크하여
//		해당 데이터 타입과 해당 배열의 데이터들을 출력
		
		Integer[] arr1 = {1,2,3,4,5};
		Double[] arr2 = {1.2, 2.4 ,5.6};
		String[] arr3 = {"Hello","Java"};
		
		System.out.println(checkType(arr1));
		System.out.println(toString(arr1));
		System.out.println("================");
		System.out.println(checkType(arr2));
		System.out.println(toString(arr2));
		System.out.println("================");
		System.out.println(checkType(arr3));
		System.out.println(toString(arr3));
	}

}
