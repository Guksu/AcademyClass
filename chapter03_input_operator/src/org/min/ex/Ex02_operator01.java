package org.min.ex;

public class Ex02_operator01 {
	public static void main(String[] args) {
		//산술연산자 중 정수의 경우 /는 몫을 구하고 %는 나머지를 구한다.(정수는 나머지를 버리기 때문)
		//모든 식은 오른쪽의값을 왼쪽으로 대입한다.
		//ex) a= a+1; 은 a+1을 먼저 구하고 이를 a에 대입한다.
		
		//<알고리즘 문제>
		//2자리 정수를 앞 뒤로 분리, 4자리 정수를 앞 뒤로 분리하고 어떤수의 제곱수를 두 부분으로 나누어 더했을 때 다시 원래의 수가 되는 수는 ?
		// ex) 81=(8+1)*(8+1)
		int num1 = 81;
		int a = num1/10;
		int b = num1%10;
		System.out.println(a +","+b);
		
		int num2 = 3025;
		int c = num2/100;
		int d = num2%100;
		System.out.println(c +","+d);
		
	}
}
