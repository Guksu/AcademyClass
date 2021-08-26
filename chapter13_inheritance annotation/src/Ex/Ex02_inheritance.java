package Ex;

class Person {
	void sleep() {
		System.out.println("잔다");
	}

	void eat(String food) {
		System.out.println(food+"를 먹는다");
	}
}

class Student extends Person{
	void study() {
		System.out.println("공부한다");
	}
}

public class Ex02_inheritance {
	public static void main(String[] args) {

		Student stu = new Student();
		stu.sleep();
		stu.eat("스파게티");
		stu.study();
	}
}
