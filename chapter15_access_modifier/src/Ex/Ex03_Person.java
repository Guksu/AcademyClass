package Ex;

import java.util.Scanner;

public class Ex03_Person {

	private String name;
	private int age;
	private double height;
	private char gender;
	private boolean isKorean;
	
	public Ex03_Person() {}
	public Ex03_Person(String name, int age, double height, char gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}

	
	private String getName() {
		return name;
	}

	public void setName(Scanner sc) {
		System.out.println("이름을 입력하시오");
		name = sc.nextLine();
		if(name.length()<2) {
			System.out.println("이름을 다시 입력하시오");
			setName(sc);
		}
	}

	private int getAge() {
		return age;
	}

	public void setAge(Scanner sc) {
		System.out.println("나이를 입력하시오");
		age = sc.nextInt();
		if(age >150) {
			System.out.println("나이를 다시 입력하시오");
			setAge(sc);
		}
	}

	private double getHeight() {
		return height;
	}

	public void setHeight(Scanner sc) {
		System.out.println("키를 입력하시오");
		height = sc.nextDouble();
		if(height >300) {
			System.out.println("키를 다시 입력하시오");
			setHeight(sc);
		}
	}

	private char getGender() {
		return gender;
	}

	public void setGender(Scanner sc) {
		System.out.println("성별을 입력하시오");
		gender = sc.next().charAt(0);
		if(gender !='남' && gender!='여'){
			System.out.println("성별을 다시 입력하시오");
			setGender(sc);
		} 
	}

	private boolean isKorean() {
		return isKorean;
	}

	public void setKorean(Scanner sc) {
		System.out.println("한국인입니까?");
		isKorean = (sc.nextLine().equals("네"))? true: false;
	}
	
	public void info() {
		System.out.println("이름 :" + getName());
		System.out.println("나이 :" + getAge());
		System.out.println("키 :" + getHeight());
		System.out.println("성별 :" + getGender());
		System.out.println("국적 :" + (isKorean()? "한국인" : "외국인"));
	}
	
}
