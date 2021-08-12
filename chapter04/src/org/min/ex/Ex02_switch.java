package org.min.ex;

public class Ex02_switch {
	public static void main(String[] args) {

		int age = 20;
		//switch 는 if문과 달리 true ,false로 구별하지 않는다
		//case는 위에서 순차적으로 작동하며 break가 없으면 끝까지 실행한다.
		switch (age/10) {
		case 0 :
		case 1 : System.out.println("미성년자");	
			break;
		default : System.out.println("성인");	
		}
		
	}
}
