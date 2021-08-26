package Ex;

class Espresso{
	String origin;

	public Espresso(String origin) {
		this.origin = origin;
	}
	
	void taste() {
		System.out.println("쓰다");
	}
}

class Latte extends Espresso{
	String milk;

	public Latte(String origin, String milk) {
		super(origin);
		this.milk = milk;
	}

	@Override
	void taste() {
		System.out.println("달다");
	}

}

public class Ex06_method_override {
	public static void main(String[] args) {

		Latte latte = new Latte("kanu", "seoul");
		latte.taste();
	}
}
