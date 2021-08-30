package Ex;

class Animal{

	public void move() {}
}

class Dog extends Animal{
	@Override	
	public void move() {
		System.out.println("Dog : dogdog");
	}
}

class Dolphin extends Animal{
	@Override
	public void move() {
		System.out.println("Dolphin : doldol");
	}
}

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("Eagle : glegle");
	}
	public void fly() {
		System.out.println("Eagle can fly !!");
	}
}

public class Ex03_polymorphism {
	public static void main(String[] args) {

		Animal[] arr = new Animal[3];
		
		//업캐스팅
		arr[0] = new Dog();
		arr[1] = new Dolphin();
		arr[2] = new Eagle();
		
		for (int i =0; i<arr.length ;i++) {
			arr[i].move();
		}
		
		//다운캐스팅   instanceof는 형 변환이 가능한지 확인하는 코드
		if( arr[2] instanceof Eagle) {
			Eagle eag = (Eagle)arr[2]; // arr[2]는 animal 데이터 타입이므로 eagle타입으로 형 변환 시켜줘야한다
			eag.fly();
		}
	}
}
