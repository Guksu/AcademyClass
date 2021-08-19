package org.min.ex;

public class Ex01_BookMain {
	public static void main(String[] args) {
		//public을 가진 클래스가 메인이며 한 클래스에 public 클래스는 하나다.
		//main 메소드를 가진 클래스가 프로그램이 실행되는 클래스다.

		Ex01_Book myBook = new Ex01_Book();
		
		
		myBook.title="Hello World";
		myBook.writer="김종민";
		myBook.price= 99999;
		myBook.isBestSeller=true;
		
		myBook.info();
		
	}
}
