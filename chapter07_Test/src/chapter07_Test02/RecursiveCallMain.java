package chapter07_Test02;

//클래스 RecursiveCall 을 정의하시오.
//- 필드  : X
//- 메소드 : recursive(n) -> n번 "Hello" 출력하기
//		 main
//★
//if-else 사용 - else 일 때 재귀 호출


public class RecursiveCallMain {
	
	static void recursive(int n) {
			
			if(n==0) {
				return; //종료
			}else {
				System.out.println("Hello");				
				recursive(n-1);
			}		
	}

	public static void main(String[] args) {
		   recursive(5);
	}
}
