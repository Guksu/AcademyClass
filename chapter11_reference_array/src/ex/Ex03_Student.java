package ex;

public class Ex03_Student {
	
	String name, dept;
	double score1, score2, average;
	boolean isPass;
	
	public Ex03_Student() {}

	public Ex03_Student(String name, String dept, double score1, double score2) {
		this.name = name;
		this.dept = dept;
		this.score1 = score1;
		this.score2 = score2;
		this.average = getAverage();
		this.isPass = getPass();
	}
	
	double getAverage() {
		return (score1+score2) / 2;
	}
	
	boolean getPass() {
		return (getAverage() >= 80) ? true : false;
	}
	
	void output() {
		System.out.println("이름 :"+ name);
		System.out.println("학과 :"+ dept);
		System.out.println("평균점수 :"+ getAverage());
		System.out.println("합격여부:"+ (isPass? "합격" :"불합격"));
	}
}
