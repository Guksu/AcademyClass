package org.joonzis.ex;

public class Ex04_String {

	public static void main(String[] args) {
	
		String str = "aabbcc";
		System.out.println(str.startsWith("a")); //()사이값은 매게변수
		System.out.println(str.endsWith("c"));
		System.out.println(str.contains("c"));	//지정된 문자를 가지고 있는가
		System.out.println(str.substring(1));	//지정된 인덱스부터 모두 출력
		System.out.println(str.substring(1,3));	//지정된 인덱스부터 다음 인덱스 전까지 출력  //이 메소드는 자주 사용된다. 
	
		String name = "김종민";
		String lastName = name.substring(0,1);
		String middleNmae = name.substring(1);
		System.out.println(lastName);
		System.out.println(middleNmae);
		
		String str2 = "  JAVA  ";
		System.out.println("*" +str2.trim()+"*");  //빈 공간을 제외하고 출력
		
		String str3 = "JA-va";
		String[] a = str3.split("-");  //지정된 문자를 기준으로 분리하여 배열로 변경
		System.out.println(a.length);
		
		if(str.equals(str2)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
//		String str4;
//		System.out.println(str4.isEmpty());		//초기화 필요
		String str5 = "";						//초기화 한 상태(변수의 값 입력)
		System.out.println(str5.isEmpty());
//		String str6 = null;						
//		System.out.println(str6.isEmpty());
	}
}
