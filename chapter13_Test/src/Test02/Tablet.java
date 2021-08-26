package Test02;

public class Tablet extends Notebook{

	String pen;
	
	
	public Tablet(String model, int price, int battery, String pen) {
		super(model, price, battery);
		this.pen = pen;
	}


	void output() {
		super.output();
		System.out.println("pen :"+ pen);
	}
}
