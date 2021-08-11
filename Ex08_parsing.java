package org.joonzis.ex;

public class Ex08_parsing {

	public static void main(String[] args) {
		//참조자료형 변수 ex: String은 대문자로 시작하며 이들은 모두 클래스다

		String strAge = "20" ;  
		String strHeight = "180.5" ;

		int age = Integer.parseInt(strAge);
		double height = Double.parseDouble(strHeight);
		System.out.println("나이 :"+age+","+ "키 :"+height);


		String s1 ="aaa";
		String s2 = s1;
		String s3 = new String("aaa");

		// == 은 주소값을 비교, 참조자료형은 값을 저장하지 않고, 주소(참조)를 저장하는 형태이다.
		// .equals() 는 메소드의 경우 대상의 값 자체를 비교
		//CBC (Cell By Cell) -원시 데이터 타입
		//CBR (Cell By Reference) -참조 객체(메소드 등)

		if(s1 == s2) {
			System.out.println("같다!");
		}else {
			System.out.println("다르다!");
		}

		if(s1 == s3) {
			System.out.println("같다!");
		}else {
			System.out.println("다르다!");
		}

		if(s1.equals(s3)) {
			System.out.println("같다!");
		}else {
			System.out.println("다르다!");
		}


	}

}
