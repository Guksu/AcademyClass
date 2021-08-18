package chapter05_Arraytest;

public class test06 {

	public static void main(String[] args) {
		// Q. Test05의 배열을 이용하여 배열 내 값들의 최소, 최대값을 출력
		int[] arr = {13, 22, -3, 92, 55, 5};

		int max = arr[0];
		int min = arr[0];

		for(int i =0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}

		}

		for(int i =0; i<arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}

		System.out.println("최대값은"+max);
		System.out.println("최소값은"+min);
	}
}
