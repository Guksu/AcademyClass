package ex;

public class Ex02_Book {

	String title, writer;
	int price, salesVolume;
	boolean isBestSeller;
	
	public Ex02_Book(String title, String writer, int price) {
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	
	public Ex02_Book(String title, int price) {
		this(title, "작자미상", price);    // this()는 그 클래스의 생성자를 의미한다.--> 이런걸 리팩토링이라 한다.  //this의 대상이 되는 생성자와 변수명은 같을 필요가 없다.
	}
	
	void setSalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;

		if(salesVolume >= 1000) {
			isBestSeller = true;
		}else {
			isBestSeller = false;
		}

	}
	void output() {
		System.out.println(title);
		System.out.println(writer);
		System.out.println(price);
	}
}
