package Test01;

public class Human {
//	Q1. Test01.java 상속 관계로 구현하시오.
//
//	Student.java				- 필드 : String name, int age, String School
//								- 메소드 : Constructor, output()
//	Worker.java					- 필드 : String name, int age, String job
//								- 메소드 : Constructor, output()
//	→ 부모클래스는 알아서 만들어보자!(Human)

	String name;
	int age;
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void output() {
		System.out.println("name :" +name);
		System.out.println("age :" +age);
	}
}
