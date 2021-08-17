package chapter04_test;

public class test18 {

	public static void main(String[] args) {
		// Q.1~100까지 모든 짝수합과 홀수합을 구하시오.

		int a =0;
		int b =0;
		for(int i =1; i<101; i++) {
			if(i%2 == 0) {
				a= a+i;
			}else {
				b=b+i;
			}
		}	
		System.out.println("짝수의 합은"+a+"\n홀수의 합은"+b);
	}
}
