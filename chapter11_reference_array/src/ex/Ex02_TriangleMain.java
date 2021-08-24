package ex;

import java.util.Scanner;

public class Ex02_TriangleMain {
	public static void main(String[] args) {

		Ex02_Triangle[] semo = new Ex02_Triangle[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<semo.length; i++) {
			semo[i] = new Ex02_Triangle();
			System.out.println("너비와 크기를 입력하시오");
			semo[i].width = sc.nextInt();
			semo[i].height = sc.nextInt();
			semo[i].output();
			System.out.println("============");
		}
		
		sc.close();
	}
}
