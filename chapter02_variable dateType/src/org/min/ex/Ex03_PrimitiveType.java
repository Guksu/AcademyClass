package org.min.ex;

public class Ex03_PrimitiveType {
	public static void main(String[] args) {
		
		//정수
		byte var1 = 127;
		short var2 = 32767;
		int var3 = 210000;
		long var4 = 10000000000L;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		//실수
		float var5 = 3.22f;
		double var6 = 3.24;
		
		System.out.println(var5);
		System.out.println(var6);
	
		//문자형
		char var7 = 'A';
		char var8 = '한';
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var7+var8); //아스키코드값으로 인식
		System.out.println(""+var7+var8);
		
		//아스키코드값   (구글로 찾아볼것)
 		int var9 = 'A';
		System.out.println(var9);
		
		//논리형
		boolean isPostive;
		isPostive = true;
		if(isPostive) {
			System.out.println("양수이다.");
			}
		
		//문자열(Primitive 타입이 아니다)
		String str = "hello";
		System.out.println(str);
	}
}
