package org.min.ex;

public class Ex01_Variable {
	public static void main(String[] args) {
		
		//1. 변수선언 (선언과 동시에 초기화 시킨코드)
		int num1 = 0;
		float num2 =0f; // float은 숫자옆에 f를 붙여야 한다.
		double num3 = 0;
		char ch = 0;
		String str1 = null; // 초기값은 0
		String str2 = "";	// 빈 문자열
		
		//2.값 대입
		num1 = 1;
		num2 = 1.5f;
		num3 = 1.5;
		ch = 'k';    //char는 ""가 아닌 ''로 입력한다
		str1 = "hello";
		str2 = "java";
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(ch);
		System.out.println(str1);
		System.out.println(str2);
		
		//3. 변수의 스코프(scope :범위)
		//  지역변수 : 코드블록({}) 내에서만 접근이 가능
		//  전역변수 : 모든 지역에서 사용 가능
		// 예시)    a   {   b}   이 경우 a영역에서 b는 사용하지 못하지만 그 반대는 가능하다.
	}
}
