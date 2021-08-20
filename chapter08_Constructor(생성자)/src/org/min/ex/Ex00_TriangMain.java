package org.min.ex;

public class Ex00_TriangMain {

	//  예를들어 String str = new Strint()에서 String()가 생성자이다.
	// 							생성자(매개변수){생성자 본분}; 형식
	public static void main(String[] args) {
		Ex00_Triangle t1 = new Ex00_Triangle();
		t1.output();   // 생성자가 class 파일에 있으므로 class에서 초기화를 진행한 값을 출력.
		
		Ex00_Triangle t2 = new Ex00_Triangle(10,20);
		t2.output();
		
	}	
}
