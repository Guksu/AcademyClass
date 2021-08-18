package chapter05_Arraytest;

import java.util.Scanner;

public class test09 {

	public static void main(String[] args) {
		//		// Q. 과목 이름을 입력받아 해당 과목 점수를 출력해주는 프로그램을 작성.
		//		무한반복을 하다가 "그만"을 입력 받으면, 프로그램 종료
		//		★	String[] subjectArr = {"Java", "Python", "Android", "JSP", "Javascript"};
		//			int[] scoreArr = {95, 88, 78, 62, 55};
		//		실행 예)
		//		Java의 점수는 : 95
		Scanner sc = new Scanner(System.in);
		String[] subjectArr = {"Java", "Python", "Android", "JSP", "Javascript"};
		int[] scoreArr = {95, 88, 78, 62, 55};

		while(true){
			System.out.println("과목명을 입력하시오");
			String names = sc.next();

			for(int i =0; i<subjectArr.length; i++) {
				if(subjectArr[i].equals(names)) {
					System.out.println(subjectArr[i]+"의 점수는"+scoreArr[i]);
				}
			}
			if(names.equals("그만")) {
				break;
			}
		}
		sc.close();
	}
}
