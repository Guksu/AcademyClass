package Test01;

public class Student extends Human{
	String school;

	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
		
	void output() {
		super.output();
		System.out.println("school :"+school);
	}
}
