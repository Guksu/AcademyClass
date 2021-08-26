package Test02;

public class Computer {

//Q2. Test02.java 상속 관계로 구현하시오.
//Notebook.java				- 필드 : String model, int price, int battery
//							- 메소드 : Constructor, output()	
//Tablet.java					- 필드 : String model, int price, int battery, String pen
//							- 메소드 : Constructor, output()
//→ 부모클래스는 알아서 만들어보자!(Computer)	
	
	String model ;
	int price ;

	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}

	void output() {
		System.out.println("model :"+ model);
		System.out.println("price :"+ price);
	}
}
