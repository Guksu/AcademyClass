package Test;

public class Test02 {

	public static <T extends Number> double sum(T[] arr) {
		double a =0;
		for(int i =0; i<arr.length; i++) {
			a = a+ arr[i].doubleValue();
		}
		return a;
	}
	public static void main(String[] args) {
//		Q2. Test02.java
//
//		정수/실수 타입의 배열을 전달하면 해당 배열에 저장된 모든 요소의 합을 리턴하는 sum() 메소드를 구현하시오.
//		예) int 5개 전달하면 5개의 합 출력
//		★
//		 - static <T extends Number> double sum()  형식 작성
//		 - 배열의 값을 가져올때 배열.doubleValue()사용
		Double[] arr = {1.0, 2.5 ,4.0 ,25.0 ,6.6};

		System.out.println(sum(arr));
	}
}
