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
	Product[] cart;
	
	
	public Customer(int startMoney) {
		this.startMoney = startMoney;
	}
	public void buy(Product product) {
		money = (startMoney - product.getPrice());
		startMoney = money;
		cart[numOfProduct] = product;
		numOfProduct++;
	}
	
	public void output() {
		System.out.println("처음 소지금액 :" + startMoney);
		System.out.println("총 구매 금액 :" + );
		System.out.println("남은 금액 :"+ );
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
		
	}
}
