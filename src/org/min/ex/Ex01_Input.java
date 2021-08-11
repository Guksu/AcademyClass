package org.min.ex;

import java.util.Scanner;

public class Ex01_Input {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in); //Scanner 객체 (인스턴스)생성  
		//***아래의 코드 순서가 중요 !!!**** // 코드는 항상 위에서 아래로 실행된다.
		System.out.println("성명 입력 >> ");
		String name = sc.nextLine();     //엔터가 눌러야 다음으로 넘어간다
		System.out.println("나이 입력  ");
		int age = sc.nextInt();          //nextInt는 엔터를 누르면 엔터를 또 누르는 형식		// 개행이라한다.
		System.out.println("키 입력 >> ");
		double height = sc.nextDouble(); //nextDouble은 엔터를 누르면 엔터를 또 누르는 형식    // 개행이라한다.
		sc.nextLine();
		System.out.println("성별 입력 >>");
		String gender = sc.nextLine();
		
		System.out.println("성명 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("키: "+height);
		System.out.println("성별: "+ gender);
		
		sc.close();  // 생선된 인스턴스(객체)를 삭제하는 코드
	}
}
