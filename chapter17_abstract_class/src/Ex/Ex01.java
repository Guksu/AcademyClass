package Ex;

abstract class Animal{
	abstract public void move();
	
	public void eat() {
		System.out.println("eat eat eat !!");
	}
}

class Dog extends Animal{
	@Override
	public void move() {
		System.out.println("Dog move  !!!");
	}
}


public class Ex01 {
	public static void main(String[] args) {
		
		Animal animal = new Dog();
		
		animal.move();
		animal.eat();
	}
}
