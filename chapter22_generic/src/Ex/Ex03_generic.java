package Ex;

import java.util.Arrays;

public class Ex03_generic {
	
	public static <T> void printArray(T[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
//		int[] arr1 = {1,2,3,4,5};
//		double[] arr2 = {1.2, 2.4 ,5.6};
		//Integer와 Double은 클래스이다
		Integer[] arr1 = {1,2,3,4,5};
		Double[] arr2 = {1.2, 2.4 ,5.6};
		String[] arr3 = {"Hello","Java"};
		
		//기본데이터타입은 구체화 불가능 따라서 int -> Integer /  double ->Double로 바꿔야 한다
		printArray(arr1);
		printArray(arr2);
		printArray(arr3);
	}
}
