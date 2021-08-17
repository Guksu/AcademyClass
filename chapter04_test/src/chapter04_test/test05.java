package chapter04_test;

public class test05 {

	public static void main(String[] args) {
		// Q. 1 ~ 100 사이의 모든 정수 합계 출력하기
		
//		int num = 1;
//		int i =0;
//		while (num !=101) {
//			i = i + num ;
//			num ++;
//		}System.out.println(i);
//		
		int sum = 0;
		for (int i =1; i<101; i++) {
			sum = sum+i;
		}System.out.println(sum);
	}	
}
