package Test01;

import java.util.ArrayList;

class Book{
	private String title, author, press, picture;
	private int price, dc, dc_pirce;
	

	public Book(String title, String author, String press, int price, String picture, int dc) {
		this.title = title;
		this.author = author;
		this.press = press;
		this.price = price;
		this.picture = picture;
		this.dc = dc;
		this.dc_pirce = getDc_pirce();
	}

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPress() {
		return press;
	}


	public void setPress(String press) {
		this.press = press;
	}


	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getDc() {
		return dc;
	}


	public void setDc(int dc) {
		this.dc = dc;
	}


	public int getDc_pirce() {
		return dcOperator();
	}


	public void setDc_pirce(int dc_pirce) {
		this.dc_pirce = dc_pirce;
	}


	public int dcOperator() {
		return (int) (price*(1-(dc*0.01)));
	}
}


//메인에 Data클래스의 ArrayList를 던져주면 이걸 가지고 객체를 생성한다.
class Data{
	private ArrayList<Book> books;


	public Data() {
		books = new ArrayList<Book>();
		books.add(new Book("DO it HTML 5 CSS 3", "고경희", "이지스퍼블리싱", 16800, "06365234.jpg", 20));
		books.add(new Book("모던 웹 디자인을 위한 HTML5 CSS3 입문", "윤인성", "한빛미디어", 30000, "06992821.jpg", 21));
		books.add(new Book("HTML5 CSS3와 함께하는 드림위버 CS6 무작정 따라하기", "고경희", "길벗", 24000, "07056591.jpg", 10));
		books.add(new Book("Head First HTML5 Programming", "엘리자베스 롭슨, 에릭 프리먼", "한빛미디어", 34000, "06950729.jpg", 20));
		books.add(new Book("만들면서 배우는 HTML5 CSS3 jQuery", "야무", "한빛미디어", 25000, "06837215.jpg", 23));
		books.add(new Book("HTML5 CSS3", "양용석", "로드북", 25000, "06741081.jpg", 15));
		books.add(new Book("HTML5 CSS3 WebGL로 재미있게 배우는 HTML5 게임 프로그래밍", "제이콥 세이드린", "제이펍", 30000, "06980245.jpg",10));
		books.add(new Book("HTML5 캔버스 완벽 가이드", "데이비드 기어리", "위키북스", 40000, "07085557.jpg", 10));
		books.add(new Book("올인원웹실무가이드 HTML 5 CSS 3", "나인환 김은영 외 1명", "제우미디어", 28000, "06630397.jpg", 16));
		books.add(new Book("HTML5와 CSS3로 작성하는 반응형 웹 디자인", "벤 프레인", "에이콘출판", 30000, "06983417.jpg", 20));
		books.add(new Book("HTML5가 보이는 그림책", "ANK Co Ltd", "성안당", 31500, "06992821.jpg", 21));
		books.add(new Book("HTML5 Canvas", "스티브 펄튼, 제프 펄튼", "한빛미디어", 38000, "06806523.jpg", 20));   
		books.add(new Book("세르게이의 HTML5 CSS3 퀵 레퍼런스", "세르게이 마브로디", "제이펍", 20000, "07114432.jpg", 10));
		books.add(new Book("이제 실전이다 HTML5 CSS3 사이트제작의 모든것", "양용석", "로드북", 25000, "06880352.jpg", 10));
		books.add(new Book("iOS와 안드로이드를 위한 HTML5", "로빈 닉슨", "한빛미디어", 33000, "07041351.jpg", 10));
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

}

class Method {
	public void dataTest(ArrayList<Book> books) {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<books.size();i++) {
		sb.append("책의 원가 : ").append(books.get(i).getPrice());
		sb.append(", 책의 할인율 : ").append(books.get(i).getDc());
		sb.append(", 할인 된 책값 : ").append(books.get(i).getDc_pirce()).append("\n");
		}
		System.out.println(sb.toString());
	}
	
	public void searchTitle(ArrayList<Book> books, String keyword) {
		for(int i=0; i<books.size();i++) {
			if(books.get(i).getTitle().contains(keyword)){
				System.out.println(books.get(i).getTitle());
			}
		}
	}
	
	public void searchAuthor(ArrayList<Book> books, String keyword) {
		for(int i=0; i<books.size();i++) {
			if(books.get(i).getAuthor().contains(keyword)){
				System.out.println(books.get(i).getTitle());
			}
		}

	}
	
	public void searchPress(ArrayList<Book> books, String keyword) {
		for(int i=0; i<books.size();i++) {
			if(books.get(i).getPress().contains(keyword)){
				System.out.println(books.get(i).getTitle()+" : <"+books.get(i).getAuthor()+">");
			}
		}
	}
}
public class Test01 {
	public static void main(String[] args) {
//		Q. 주어진 데이터 내의 
//		1) 책의 원가, 할인율, 할인 된 책값 출력,
//		2) 책 제목이 "HTML"을 포함하는 책 제목 출력 메소드
//		3) 저자가 "제프"를 포함하는 책 제목 출력
//		4) 출판사가 "미디어"를 포함하는 책 제목과 저자 출력
//		
//		
//
//	1) BookClass	필드 : String title, author, press, picture
//						int price, dc, dc_price
//					메소드 : Constructor
//						   dcOperator() - 할인 금액 계산	
//						setters and getters
//					
//					
//	2) DataClass	필드 : ArrayList<BookClass> books
//					메소드: 	setters and getters
//
//	3) MethodClass	메소드 : dataTest(books) - 책값, 할인율, 할인책값
//							searchTitle(books, keyword) - 문구를 포함하는 책 제목을 출력
//							searchAuthor(books, keyword) - 저자를 검색해서 책 제목을 출력
//							searchPress(books, keyword) - 출판사를 검색해서 책 제목과 저자를 출력
//							
//	4) MainClass	각 객체 생성
//					MethodClass 메소드 호출
	
		
		Method method = new Method();
		Data dc = new Data();
		method.dataTest(dc.getBooks());
		System.out.println("=============================");
		method.searchTitle(dc.getBooks(),"HTML");
		System.out.println("=============================");
		method.searchAuthor(dc.getBooks(),"제프");
		System.out.println("=============================");
		method.searchPress(dc.getBooks(),"미디어");
		
	}
}
