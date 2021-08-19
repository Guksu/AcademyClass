package org.min.ex;

public class Ex01_RectMain {
	public static void main(String[] args) {
		//return 값은  하나만 가능하다. 여러개의 return값을 얻기 위해선 배열을 사용하면 된다.
		
		//=======!!!!!!!!중요!!!!!!!!!!!===========
		//    <메소드 오버로딩>
		// 메소드 이름이 같지만 매개변수선언이 다른 메소드가 여러 개 존재할 수 있다.
		//ex) sout(int)// sout(String)
					
		Ex01_Rect r = new Ex01_Rect();  //오른쪽은 디폴트 생성자
		
		r.setFields(100, 200);
		r.output();
		System.out.println("========");
		r.setFirelds(300);
		r.output();
	}
}
