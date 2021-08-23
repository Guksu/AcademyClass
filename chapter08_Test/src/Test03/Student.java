package Test03;

public class Student {

	String name, dept;
	Grade grade;
	
	public Student(String name, String dept, Grade grade) {
		this.name = name;
		this.dept = dept;
		this.grade = grade;
	}
	
	void output() {
		System.out.println("이름 :"+ name);
		System.out.println("부서 :"+ dept);
		System.out.println("평균 :"+ grade.getAverage());
		System.out.println("학점 :"+ grade.getGrade());
	}
}
