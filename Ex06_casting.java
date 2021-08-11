package org.joonzis.ex;

public class Ex06_casting {
	public static void main(String[] args) {

		//1. 자동형 변환
		System.out.println(1+1.5);
		//JAVA스스로 실수와 정수를 모두 실수로 변환 후 계산
		
		//2. 강제형 변환
		int a = (int)20.9;  //(int)를 통해 실수를 강제로 정수로 변환
		System.out.println(a);
		
		int b = 1;
		int c = 2;
//		int e = b/c;	//e는 int형 변수이기 때문에 소숫점은 생략해서 출력
		double e =(double) b/c;	//강제변환을 통해 올바른 값을 구하는 코드
		System.out.println(e); 
	}
}
