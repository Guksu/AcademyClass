package Ex;

import java.util.Scanner;

public class Ex04_BookMain {
	public static void main(String[] args) {

		Ex04_Book[] book = new Ex04_Book[2];
		
		for(int i =0; i<book.length; i++) {
		book[i] = new Ex04_Book();
		book[i].setTitle(new Scanner(System.in));
		book[i].setWriter(new Scanner(System.in));
		book[i].setPrice(new Scanner(System.in));
		book[i].setSalesVolume(new Scanner(System.in));
		book[i].setBestSeller();
		
		book[i].output();
		System.out.println("===========");
		}
	}
}
