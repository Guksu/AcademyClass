package Ex;

public class Ex04_exception {
	
	//인스턴스 생성 없이 바로 사용가능 
	static void divide(int num1, int num2) throws ArithmeticException{
		System.out.println("몫:" + (num1/num2));
		System.out.println("나머지:" + (num1%num2));
	}
	
	public static void main(String[] args) {

		// throw(예외 떠넘기기)
		// - 메소드를 호출한 곳으로 예외를 떠넘긴다.
		// - 떠넘길 예외 클래스를 쉼표로 구분하여 나열할 수 있다.
		// - throw 키워드가 붙어있는 메소드는 반드시 try 블록내에서 호출되어야 한다
		// 이런 방식을 사용하는 이유는 여러 개발자가 같은 메소드를 바라보고 있을 시 공용처리보단 throw로 개별처리하는것이 더 효율적이다
		
 		try {
		divide(1,2);	//개발자1
		divide(1,0);	//개발자2
 		}catch (Exception e) {
		 System.out.println("0으로 나눌 수 없다");
		 e.printStackTrace(); //에러 메세지도 보는 코드
		}
	}
}
