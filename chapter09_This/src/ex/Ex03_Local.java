package ex;

public class Ex03_Local {

	String name, sn;
	int age;
	boolean isKorean;
	
	public Ex03_Local(String name, int age, String sn) {
		this.name = name;
		this.age = age;
		this.sn = sn;
		if( sn != null) {
			isKorean = sn.charAt(7) <='4' ? true : false;
		}
	}
	
	public Ex03_Local(String name, int age) {
		this(name, age, null);
	}
	
	void output() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(sn);
		System.out.println(isKorean? "한국인": "외국인");
	}
}
