package chapter05_Arraytest;

public class test03 {

	public static void main(String[] args) {
		//Q. Test02.java 의 값들을 모두 더하고, 총점과 평균을 출력

		int[] arr = {10,20,50,60,13,25,97};
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			sum=arr[i]+sum;
		}
		int middle = sum/arr.length;
		System.out.println(sum);
		System.out.println(middle);
	}
}
