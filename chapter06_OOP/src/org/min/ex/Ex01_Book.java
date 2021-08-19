package org.min.ex;

public class Ex01_Book {
	
	String title;
	String writer;
	int price;
	boolean isBestSeller;
	
	void info() {
		System.out.println("제목: "+title);
		System.out.println("저자: "+ writer);
		System.out.println("가격: "+ price);
		System.out.println(isBestSeller? "베스트셀러": "일반서적");
	}
}
