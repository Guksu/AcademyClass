package Test03;

public class StudentGradeMain {

	public static void main(String[] args) {
//		Q3.
//		Grade.java				필드 - int kor, int eng, int mat, double average, char grade
//								메소드 - Constructor, getAverage(평균을 리턴), getGrade(학점을 리턴)
//		Student.java			필드 - String name, String dept, Grade grade
//								메소드 - Constructor, output
//		StudentGradeMain.java
		
		Student stu = new Student("Kim", "K1", new Grade(80,80,80));
	
		stu.output();
	}

}
