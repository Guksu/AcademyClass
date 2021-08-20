package chapter07_Test03;

//Q3.
//클래스 Dog을 정의하시오.
//- 필드 : String name, String breed, int age
//- 메소드 : setDog(name, age) : 품종은 푸들
//		setDog(name, age, breed) 
//		info(name, age, breed)
//		

public class Dog {
	String name, breed;
	int age;
	
	void setDog(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void setDog(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	
	void info() {
		System.out.println("강아지 이름 :"+ name);
		System.out.println("강아지 나이 :"+ age);
		if(breed!=null) {
			System.out.println("강아지 품종 :"+breed);
		}else {
			System.out.println("강아지 품종 :푸들");
		}
	}
}
