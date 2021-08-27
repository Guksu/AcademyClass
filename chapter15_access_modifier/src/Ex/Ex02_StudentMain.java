package Ex;

import java.util.Scanner;

public class Ex02_StudentMain {
	public static void main(String[] args) {

		Ex02_Student stu1 = new Ex02_Student("kim", "무역");
		Ex02_Student stu2 = new Ex02_Student("won", "회계");
		
		stu1.input(new Scanner(System.in));
		System.out.println("============");
		stu1.output();
		System.out.println("============");
		stu2.input(new Scanner(System.in));
		System.out.println("============");
		stu2.output();
		
//		===========참조배열일 경우 ================
//		Ex02_Student[] stu = new Ex02_Student[2];
//		
//		for(int i = 0; i<stu.length; i++ ) {
//			stu[i] = new Ex02_Student();
//			stu[i].setName(new Scanner(System.in));
//			stu[i].setDept(new Scanner(System.in));
//			stu[i].input(new Scanner(System.in));
//			System.out.println("=========");
//			stu[i].output();
//		}
		
		
	}
}
