package org.min.ex;

public class Ex04_operator03 {
	public static void main(String[] args) {
		
		//비교 연산자
		int a = 10;
		System.out.println(a ==10 && a<100);
		System.out.println(a !=10 || a<100);
		System.out.println(!(a==10));
		
		int b = 10;
		boolean result = (a==100) && (++b >10);  // a가 거짓이기 떄문에 b는 실행하지 않음
		System.out.println("result: "+result + ","+ "b: "+b); //따라서 b의 값음 여전히 10
	
		int age = 18;
		boolean isAdult = (age >= 20) ? true : false;  //()조건이 참이면 true 아니면  false
		int fee = isAdult ? 4000 : 2000;
		System.out.println("요금 :"+fee+","+"성인인가?: "+isAdult);
	
		String id = "admin";
		String auth = id.equals("admin")? "인증성공" :"인증실패";
		System.out.println(auth);
	}
}
