package org.min.test;

import java.util.Scanner;
//		Q4. 
//		클래스 Student
//		- 필드 :
//		String name, String dept, String score1, String score2
//		double average
//		boolean isPass(합격 유무) : 80점 이상 true, 80점 미만 false
//		- 메소드 : 
//		input : name, dept, score1, score2 콘솔입력, 평균 및 패스 유무 확인
//		output : name, dept, average, isPass ("합격","불합격")

//		클래스 StudentMain
//		- 메소드 : main

class Student{
	String name, dept; 
	double score1, score2;   //스트링으로 할 시 input에서 average 구하기전에 Double.parseDouble()로 변환하고 구한다.
	double average; //= (score1+score2)/2; --> score값을 초기화를 안 해서 오류(출력값이 0)가 뜸
	boolean isPass;
	
	
	void input(Scanner in) {
		System.out.println("name을 입력하시오");
			name=in.nextLine();
		System.out.println("dept을 입력하시오");
			dept=in.nextLine();
		System.out.println("score1을 입력하시오");
			score1=in.nextDouble();
		System.out.println("score2을 입력하시오");
			score2=in.nextDouble();
//		=======!!!!!여기가 중요 !!!!!==========
		average = (score1+score2)/2;
		if(average>=80) {
			isPass=true;
		}
	}
	
	void output() {
		System.out.println("name :"+name);
		System.out.println("dept :"+dept);
		System.out.println("average :"+average);
//		if(isPass==true) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
//		======간단한 방식=========		
		System.out.println(isPass? "합격 ": "불합격");
	}
}

public class test04 {

	public static void main(String[] args) {

		
		Student st = new Student();

//		=======!!!!!중요 !!!!=========		
//		Scanner sc = new Scanner(System.in);
//		st.input(sc);		
		st.input(new Scanner(System.in));
		st.output();
	}
}
