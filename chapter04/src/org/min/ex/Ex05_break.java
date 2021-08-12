package org.min.ex;

import java.util.Scanner;

public class Ex05_break {
	public static void main(String[] args) {

		String id = "";
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("ID를 입력하시오");
			id= sc.next();
			
			if(id.equals("admin")) {
				System.out.println("ID일지");
				break;
			}
			else {
				System.out.println("다시 입력하시오");
			}
		}
		sc.close();
	}
}
