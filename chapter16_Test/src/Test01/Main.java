package Test01;

public class Main {
	public static void main(String[] args) {

		//		Q. 주어진 데이터 내의 
		//		전체 책값, 
		//		"길벗" 출판사의 도서명(문자열 정확히 일치), 
		//		"길벗" 을 포함한 출판사의 도서명(문자열 포함)을 출력
		//
		//	1) InfoClass
		//		필드 : String title(도서명), int price(가격), String author(저자), String press(출판사)
		//		생성자 : 기본 생성자 및 데이터 셋팅 생성자
		//	2) DataClass
		//		필드 : InfoClass[]
		//		생성자 : 기본생성자 - InfoClass 객체에 생성
		//	3) MainClass
		//		DataClass를 통한 전체 책 값 출력
		//		전체 도서 중 출판사가 "길벗"인 도서명 출력(equals)
		//		전체 도서 중 출판사가 "길벗"을 포함한 도서명 출력(contains)

		Data data = new Data();
		int total=0;
		
		for(int i=0; i<data.info.length; i++) {
			total+=data.info[i].price;
		}
		
		System.out.println("전체 책값: "+total+"원");
		System.out.println("========================");
		for(int i =0; i<data.info.length; i++) {
			if(data.info[i].press.equals("길벗")) {
				System.out.println("길벗 출판사 도서명 : "+data.info[i].title);
			}
		}
		
		System.out.println("========================");
		for(int i =0; i<data.info.length; i++) {
			if(data.info[i].press.contains("길벗")) {
				System.out.println("길벗을 포함한 출판사 도서명 : "+data.info[i].title);
			}
		}
	}
}
