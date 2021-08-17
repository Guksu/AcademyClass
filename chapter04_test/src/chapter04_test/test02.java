package chapter04_test;

public class test02 {

	public static void main(String[] args) {
		// 입력받은 구구단만 출력하기
//		ex) 4X1=4
//				4X2=8

		int b= 2;
		while(b<10) {
			for(int i=1; i<10; i++) {
				int c= i*b;
				System.out.println(c);
			}break;
		}
	}
}
