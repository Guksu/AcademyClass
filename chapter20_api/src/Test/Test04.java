package Test;

class Student{
	private String no , name;
	private int[] scores = new int[3];
	private double average;
	private char grade;
	static final int COURSE_COUNT = 3;
	
	public Student(String no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public void setScores(int kor, int eng, int mat){
		scores[0] = kor;
		scores[1] = eng;
		scores[2] = mat;
	}
	
	public void setScores(int[] scores) {
 	}
	public void setAverage() {
		average =(double)(scores[0]+scores[1]+scores[2])/COURSE_COUNT;
	}
	public void setGrade() {
		if(average >=90) {
			grade='A';
		}else if (average >=80) {
			grade='B';
		}else {
			grade ='C';
		}
	}

	@Override
	public boolean equals(Object obj) {
		if( obj != null && obj instanceof Student) {
			return no.equals(((Student)obj).no);
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "이름: "+name+", 학번: "+no+", 평균:"+average+", 학점: "+grade;
	}
	
}
public class Test04 {

	public static void main(String[] args) {
//		Q4. Test04.java
//
//		Student 클래스				필드 : String no(학번), String name, int[] scores(국,영,수)
//									     double average, char grade, 상수 int COURSE_COUNT(과목수)
//									메소드 : Student(String no, String name)
//										   setter{
//											setScores(int kor, int eng, int mat) - 직접 입력
//											setScores(int[] scores) - 랜덤 입력
//											setAverage()
//											setGrade()
//											}
//										   toString() 학번, 성명, 평균, 학점 출력
//										   equals() 학번이 같으면 같은 학생으로 비교   

		Student stu1 = new Student("2021", "kim");
		Student stu2 = new Student("2020", "kim");
		
		stu1.setScores(90, 90, 90);
		stu1.setAverage();
		stu1.setGrade();
		System.out.println(stu1.toString());
		System.out.println(stu1.equals(stu2));
	}
}
