package Ex;

class Mother{
	public Mother() {
		System.out.println("Mother 생성");
	}
}

class Son extends Mother{
	public Son() {
		System.out.println("Son 생성");
	}
	
	void doSon() {
		System.out.println("doSon() 호출");
	}
}

public class Ex04_constructor {
	public static void main(String[] args) {

		//자식 클래스의 생성자는 부모 클래스의 생성자를 먼저 호출한다.
		
		Son son = new Son();
		
		son.doSon();
	}
}
