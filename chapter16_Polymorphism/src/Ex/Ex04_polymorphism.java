package Ex;

class Person{

	public void eat(String food) {
		System.out.println(food+"를먹는다");
	}
	
	public void sleep() {
		System.out.println("잔다");
	}
	
}

class Student extends Person{
	public void study() {
		System.out.println("공부한다");
	}
}

class Worker extends Person{
	public void work() {
		System.out.println("일한다");
	}
}

public class Ex04_polymorphism {
	public static void main(String[] args) {

		Person per1 = new Student();
		Person per2 = new Worker();
		
		per1.eat("Ramen");
		per1.sleep();
		if( per1 instanceof Student) {
			((Student) per1).study(); // Student stu = (Student)per1;
		}
		System.out.println("=============");
		per2.eat("Warter");
		per2.sleep();
		if( per2 instanceof Worker) {
			((Worker) per2).work();
		}
	}
}
