package chapter05_Array;

import java.util.Scanner;

public class Ex03_String_array {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[]name = new String[3];
		
		for(int i = 0; i<name.length; i++) {
			System.out.println("이름입력하세요");
			name[i]=sc.nextLine();
		}
		
		for(String num : name) {
			System.out.println(num);
		}
		sc.close();
	}
}
