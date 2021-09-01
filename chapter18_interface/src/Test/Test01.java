package Test;

interface Computable{
	void connectInternet();
	void playApp();
}
class Phone{
	String owner;

	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void sendCall() {
		System.out.println("send");
	}
	
	public void receiveCall() {
		System.out.println("receive");
	}
}


class SmartPhone extends Phone implements Computable{

	public SmartPhone(String owner) {
		super(owner);
	}

	@Override
	public void connectInternet() {
		System.out.println("connerct naver");
	}

	@Override
	public void playApp() {	
		System.out.println("play game");
	}
	
}
public class Test01 {

	public static void main(String[] args) {
//		Q1. Test01.java
//		스마트폰 => 전화기 + 컴퓨터 
//
//		class Phone 				필드 : String owner
//									메소드 : Constructor, sendCall(), receiveCall()
//		interface Computable		메소드 : connectInternet(), playApp()
//		class SmartPhone 			Phone 상속, Computable 구현

		SmartPhone sp = new SmartPhone("kim");
		
		sp.connectInternet();
		sp.playApp();
		sp.sendCall();
		sp.receiveCall();
	}
}
