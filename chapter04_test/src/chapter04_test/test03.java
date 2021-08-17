package chapter04_test;

public class test03 {

	public static void main(String[] args) {
		//Q. 전체 구구단 출력하기_1    2x1 = 2    2x2 = 4

		int b= 2;
		while(b<10) {
			for(int i=1; i<10; i++) {
				int c= i*b;
				System.out.println(c);
			}
			b++; 
		}
	}
}
