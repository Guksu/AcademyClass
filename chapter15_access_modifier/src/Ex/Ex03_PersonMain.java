package Ex;

import java.util.Scanner;

public class Ex03_PersonMain {
	public static void main(String[] args) {

		Ex03_Person per = new Ex03_Person();
		
		per.setName(new Scanner(System.in));
		per.setAge(new Scanner(System.in));
		per.setHeight(new Scanner(System.in));
		per.setGender(new Scanner(System.in));
		per.setKorean(new Scanner(System.in));
		
		per.info();
	}
}
