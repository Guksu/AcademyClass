package org.min.test;

public class Test03 {
	public static void main(String[] args) {
		//	Q. 매출액과 등급("VIP","일반")을 입력받아 등급이 "VIP"이면 매출액에서 20%를 할인하고
		//	   "일반"이면 매출액에서 5%를 할인하는 프로그램 구현 

		Scanner sc = new Scanner(System.in);
		String str1 = "VIP";
		String str2 = "일반";
		System.out.println("매출액을 입력하시오 >>");
		double a = sc.nextDouble();
		sc.nextLine();
		System.out.println("등급을 입력하시오 >>");
		if(sc.nextLine().equals(str1)) {
			System.out.println("매출액 :" +a*0.8);
		}
		if(sc.nextLine().equals(str2)) {
			System.out.println("매출액 :"+a*0.95);
		}
		else {
			System.out.println("올바른 등급을 입력해주십시오");
		}
		sc.close();

		
	}
}
