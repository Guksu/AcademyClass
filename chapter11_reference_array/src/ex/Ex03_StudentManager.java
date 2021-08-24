package ex;

import java.util.Scanner;

public class Ex03_StudentManager {

	Ex03_Student[] arr;
	Scanner sc = new Scanner(System.in);
	int idx;
	
	public Ex03_StudentManager(int numOfSudent) {
		arr = new Ex03_Student[numOfSudent];
	}
	
	Ex03_Student input() {						//void가 아니므로 return이 필요
		System.out.println("학생이름 ");
		String name = sc.nextLine();
		System.out.println("학과 ");
		String dept = sc.nextLine();
		System.out.println("중간점수 ");
		double score1 = sc.nextDouble();
		System.out.println("기말점수 ");
		double score2 = sc.nextDouble();
		sc.nextLine();
		return new Ex03_Student(name, dept, score1, score2);
	}
	
	void addNewStudent(Ex03_Student stu) {  //stu =Ex03_Student(name, dept, score1, score2) //stu에는 Ex03_Student 클래스 형태의 변수가 들어간다.
		arr[idx] = stu;
		idx++;
	}
	
	void outputAllStudent() {
		for(int i =0; i<idx; i++) {
			System.out.println((i+1)+"번 학생정보");
			arr[i].output();
			System.out.println("=========");
		}
	}
	
	void outputAverage() {
		double total = 0;
		for(int i =0; i<idx; i++) {
			total +=arr[i].getAverage();
		}
		System.out.println("전체평균 :"+ total/idx );
	}
	
	Ex03_Student findStudent() {
		System.out.println("찾을 학생 이름을 입력");
		String fName = sc.nextLine();
		for(int i=0; i<idx; i++) {
			if(fName.equals(arr[i].name)) {
				return arr[i];
			}
		}
		return null;
	}
	
	void output(Ex03_Student stu) {
		if(stu != null) {
			stu.output();
		}else{
			System.out.println("찾는 학생이 없습니다");
		}
	}
}
