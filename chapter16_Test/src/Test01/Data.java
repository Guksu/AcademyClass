package Test01;

public class Data {

	//	★DataClass에 적용, (책 제목, 가격, 저자, 출판사)
	//
	//	new Info("이것이 자바다", 30000, "신용권", "한빛미디어");
	//	new Info("파이썬", 25000, "홍길동", "길벗");
	//	new Info("정보처리기사", 35000, "기사", "길벗");
	//	new Info("HTML", 15000, "꾸미기", "한빛미디어");
	//	new Info("JSP&Servlet", 23000, "열혈", "길벗출판사");
	//	new Info("오라클", 21000, "oracle", "A길벗 출판사");
	//

	Info[] info = new Info[6];

	public Data() {
		info[0] = new Info("이것이 자바다", 30000, "신용권", "한빛미디어");
		info[1] = new Info("파이썬", 25000, "홍길동", "길벗");
		info[2] = new Info("정보처리기사", 35000, "기사", "길벗");
		info[3] = new Info("HTML", 15000, "꾸미기", "한빛미디어");
		info[4] = new Info("JSP&Servlet", 23000, "열혈", "길벗출판사");
		info[5] = new Info("오라클", 21000, "oracle", "A길벗 출판사");
	}
}
