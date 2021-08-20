package org.min.ex;

public class Ex01_RectMain {
	public static void main(String[] args) {
		
		Ex01_Rect re1 = new Ex01_Rect();
		Ex01_Rect re2 = new Ex01_Rect(100);
		Ex01_Rect re3 = new Ex01_Rect(200,200);
		Ex01_Rect re4 = new Ex01_Rect(400,300);
		
		re1.output();
		System.out.println("========");
		re2.output();
		System.out.println("========");
		re3.output();
		System.out.println("========");
		re4.output();
	}
}
