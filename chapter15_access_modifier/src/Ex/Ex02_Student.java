package Ex;

import java.util.Scanner;

public class Ex02_Student {

	private String name, dept;
	private double score1, score2, average;
	boolean isPass;
	
	public Ex02_Student() {}
	
	public Ex02_Student(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	
	public void input(Scanner sc) {
		System.out.println("중간점수룰 입력하시오");
		score1 = sc.nextDouble();
		System.out.println("기말점수룰 입력하시오");
		score2 = sc.nextDouble();
	}
	
	private double getAverage() {
		return average = (score1+score2)/2;
	}
	
	private boolean isPass() {
		return isPass = (average >=80) ? true : false;
	}
	
	public void output() {
		System.out.println("이름 :"+ name);
		System.out.println("학과 :"+ dept);
		System.out.println("평균 :"+ getAverage());
		System.out.println("합격여부 :"+ (isPass()? "합격" :"불합격") );
	}

//	======참조배열로 만들 경우============
//	private String getName() {
//		return name;
//	}
//
//	public void setName(Scanner sc) {
//		System.out.println("이름을 입력하시오");
//		name = sc.nextLine();
//	}
//
//	private String getDept() {
//		return dept;
//	}
//
//	public void setDept(Scanner sc) {
//		System.out.println("학과를 입력하시오");
//		dept = sc.nextLine();
//	}
//	
//	public void output() {
//		System.out.println("이름 :"+ getName());
//		System.out.println("학과 :"+ getDept());
//		System.out.println("평균 :"+ getAverage());
//		System.out.println("합격여부 :"+ (isPass()? "합격" :"불합격") );
//	}
}
