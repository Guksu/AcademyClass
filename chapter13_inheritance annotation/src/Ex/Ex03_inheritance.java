package Ex;

class Car{
	void drive() {
		System.out.println("달린다");
	}
}

class Ev extends Car{
	void charging() {
		System.out.println("충전한다");
	}
}

public class Ex03_inheritance {
	public static void main(String[] args) {

		Ev ev = new Ev();
		ev.charging();
		ev.drive();
		
	}
}
