package org.min.ex;

public class Ex02_Person {
		
	String name;
	int age;
	double height;
	char gender;
	
	public Ex02_Person(String name , int age, double height, char gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}
	
	void output() {
		System.out.println("이름 :"+ name);
		System.out.println("나이 :"+ age);
		System.out.println("신장 :"+ height);
		System.out.println("성별 :"+ gender);
	}
}
