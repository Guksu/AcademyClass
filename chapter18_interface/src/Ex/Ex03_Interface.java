package Ex;

interface Eatable{
	void eat();
}

class Pig{
	public void piggy() {
		System.out.println(" eat all !!");
	}
}

class Apple extends Pig implements Eatable{
	@Override
	public void eat() {
		System.out.println(" apple is delicious!");
	}
}
public class Ex03_Interface {
	public static void main(String[] args) {

		
	}
}
