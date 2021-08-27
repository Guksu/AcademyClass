package Ex;

import java.util.Scanner;

public class Ex04_Book {

	private String title, writer;
	private int price, salesVolume;
	private boolean isBestSeller;
	
	public Ex04_Book() {}
	
	public Ex04_Book(String title, int price) {
		this(title, "작자미상", price);
	}
	public Ex04_Book(String title, String writer, int price) {
		this.title = title;
		this.writer = writer;
		this.price = price;
	}

	
	private String getTitle() {
		return title;
	}

	public void setTitle(Scanner sc) {
		System.out.println("책 이름을 입력하시오");
		title = sc.nextLine();
	}

	private String getWriter() {
		return writer;
	}

	public void setWriter(Scanner sc) {
		System.out.println("작가를 입력하시오");
		writer = sc.nextLine();
		if(writer.equals("")) {
			writer = "작자미상";
		}
	}

	private int getPrice() {
		return price;
	}

	public void setPrice(Scanner sc) {
		System.out.println("가격을 입력하시오");
		price = sc.nextInt();
	}

	private int getSalesVolume() {
		return salesVolume;
	}

	public void setSalesVolume(Scanner sc) {
		System.out.println("판매량을 입력하시오");
		salesVolume = sc.nextInt();
	}

	private boolean isBestSeller() {
		return isBestSeller;
	}

	public void setBestSeller() {
		isBestSeller = (salesVolume >=1000) ? true : false;
	}
	
	public void output() {
		System.out.println("제목 :"+ getTitle());
		System.out.println("작가 :"+ getWriter());
		System.out.println("가격 :"+ getPrice());
		System.out.println("판매량 :"+ getSalesVolume());
		System.out.println("이 책은 :"+ (isBestSeller() ? "베스트셀러입니다" : "베스트셀러가 아닙니다"));
	}
}
