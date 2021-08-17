package chapter04_test;

public class test04 {

	public static void main(String[] args) {
		// Q. 전체 구구단 출력하기_2      2x1 = 2 	3x1 = 3 	...

		int a =1;
		while(a <10) {
			for (int i = 2; i<10; i++) {
				int c = i*a;
				System.out.println(c);
			}
			a++;
		}
	}
}