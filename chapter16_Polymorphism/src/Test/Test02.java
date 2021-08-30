package Test;

class Product {
	private String model;
	private int price;
	
	public Product(String model, int price) {
		this.model = model;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}

}

class Tv extends Product{

	public Tv(String model, int price) {
		super(model, price);
	}
}

class Computer extends Product{

	public Computer(String model, int price) {
		super(model, price);
	}	
}

class Customer{
	int money, startMoney, numOfProduct;
	Product[] cart = new Product[2];
	
	public Customer(int startMoney) {
		this.startMoney = startMoney;
	}
	public void buy(Product product) {
		money +=product.getPrice();
		cart[numOfProduct] = product;
		numOfProduct++;
	}
	
	public void output() {
		for(int i=0; i<numOfProduct; i++) {
			System.out.println("구입상품 :"+cart[i].getModel() +" / 상품가격 :"+cart[i].getPrice());
		}
		System.out.println("처음 소지금액 :" + startMoney);
		System.out.println("총 구매 금액 :" + money);
		System.out.println("남은 금액 :"+ (startMoney-money));
	}
}
public class Test02 {
	public static void main(String[] args) {
		//Q2. Test02.java
		//
		//Product 클래스			필드 : String model, int price
		//						메소드 : Constructor, getters
		//Tv 클래스					필드 : X
		//						메소드 : Constructor
		//Computer 클래스			필드 : X
		//						메소드 : Constructor
		//Customer				필드 : int money, int startMoney, Product[] cart, int numOfProduct
		//						메소드 : Constructor, buy(Product), output		
		//★
		//필드는 전부 private
		//Tv extends Product		
		//Computer extends Product
		//
		//== 2명의 Customer가 각각 Tv, Computer를 구매 
		
		Customer cus1 = new Customer(1000);
		Customer cus2 = new Customer(2000);
		
		cus1.buy(new Tv("HVD", 200));
		cus1.buy(new Computer("SPQ", 400));

		cus2.buy(new Tv("DHB", 500));
		cus2.buy(new Computer("PQR", 1000));
		
		cus1.output();
		System.out.println("==========");
		cus2.output();
	}
}
