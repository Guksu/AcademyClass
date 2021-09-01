package Ex;

interface Animal{
	void move();
}

class Dog implements Animal{
	@Override
	public void move() {
		System.out.println("Dog Dog !!");
	}
}
public class Ex01_Interface {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		dog.move();
	}
}
