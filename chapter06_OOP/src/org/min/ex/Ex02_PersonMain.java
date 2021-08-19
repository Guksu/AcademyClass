package org.min.ex;

class Person{
	char gender;
	int age;
	double height;
	String name;

	void info() {
		System.out.println("성별 :"+gender);
		System.out.println("나이 :"+age);
		System.out.println("신장 :"+height);
		System.out.println("이름 :"+name);
	}
}

public class Ex02_PersonMain {
	public static void main(String[] args) {

		Person woman = new Person();
		Person man = new Person();
		
		woman.gender = '여';
		woman.age = 28;
		woman.height=170;
		woman.name="여자";

		man.gender = '남';
		man.age = 28;
		man.height=178;
		man.name="남자";
	
		woman.info();
		System.out.println("------");
		man.info();
	}
}
