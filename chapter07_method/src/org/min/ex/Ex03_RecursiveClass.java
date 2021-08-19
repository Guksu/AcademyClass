package org.min.ex;

public class Ex03_RecursiveClass {
	static int count =0;
	
	static void recursive() {
		System.out.println("recursive call");
		count++;
		if(count ==5) {
			return;   //반복문을 벗어날땐 break 메소드 혹은 함수에서 벗어날땐 return
		}
		recursive(); //자기가 자신을 부르는것
	}
	
	
	public static void main(String[] args) {
		// 재귀 호출
		recursive();

	}
}
