package ex;

public class Ex01_Person {
	String name;
	int age;
	double height;
	char gender;
	
	public Ex01_Person() {
		
	}
	
	public Ex01_Person(String name, int age, double height, char gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}
	
	void info() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(gender);
	}
}
