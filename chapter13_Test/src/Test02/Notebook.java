package Test02;

public class Notebook extends Computer{

	int battery;

	public Notebook(String model, int price, int battery) {
		super(model, price);
		this.battery = battery;
	}
	
	void output() {
		super.output();
		System.out.println("battery :"+ battery);
	}
}
