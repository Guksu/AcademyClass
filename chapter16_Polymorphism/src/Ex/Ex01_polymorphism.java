package Ex;

class Product{
	public void info() {
		System.out.println("Product");
	}
}

class Computer extends Product{
	@Override
	public void info() {
		System.out.println("Computer");
	}
}

class Notebook extends Computer{
	@Override
	public void info() {
		System.out.println("Notebook");
	}
}
public class Ex01_polymorphism {
	public static void main(String[] args) {

		Computer[] com = new Computer[10];
		Notebook[] note = new Notebook[10];
		
		for (int i=0; i<com.length; i++) {
			com[i] = new Computer();
			note[i] = new Notebook();
		}	

		Product[] pro = new Product[20];
		//업캐스팅
		pro[1] = new Computer();
		pro[2] = new Notebook();
		
		pro[1].info();
		pro[2].info();
		
	}
}
