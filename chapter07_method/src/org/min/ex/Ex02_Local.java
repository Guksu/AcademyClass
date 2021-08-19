package org.min.ex;

public class Ex02_Local {

	String name;		//String의 초기값은 null
	int age;			//int의 초기값은 0
	String sn;
	boolean isKorean;  //boolean의 초기값은 false
	
	//class의 전역변수의 이름과 매개변수의 이름을 구별하기 위해서 this.전역변수 =매개변수; 로 설정한다.
	void setLocalInfo(String _name, int _age, String _sn) {
		setLocalInfo(_name, _age);
		sn = _sn;
		isKorean = sn.charAt(6) <= '4' ? true :false;
	}
	
	void setLocalInfo(String _name, int _age) {
		name = _name;
		age = _age;
	}
	
	void output() {
		System.out.println("이름 :"+name);
		System.out.println("나이 :"+age);
		System.out.println("주민등록번호 :"+( sn==null? "없음":sn ));
		System.out.println(isKorean? "한국인":"외국인");
		
	}
}
