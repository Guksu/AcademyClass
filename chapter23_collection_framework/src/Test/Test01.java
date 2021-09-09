package Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class Board{
	private String title;
	private String content;
	private Date register;
	
	public Board(String title, String content, Date register) {
		this.title = title;
		this.content = content;
		this.register = register;
	}

	@Override
	public String toString() {
		return "[title=" + title + ", content=" + content + ", register=" + register + "]";
	}

}
public class Test01 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
//		Q1. Test01.java
//
//		게시물을 저장하는 Board 클래스를 정의하고, ArrayList를 이용하여 3개의 게시물을 저장하시오.
//		1~3번 게시물번호 중 하나를 입력 받아 해당 게시물을 삭제하시오.
//
//		class Board {
//
//			private String title;
//			Private String content;
//			Private Date register;						// 현재 날짜 자동 삽입
		ArrayList<Board> arr = new ArrayList<Board>();
		Date date = new Date();
		SimpleDateFormat  format1, format2, format3;
		format1 = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		arr.add(new Board("Number1","Game", format1.format(date.getDay()))) ;
		arr.add(new Board("Number2", "Drama", new Date(2021, 11, 4)));
		arr.add(new Board("Number3", "Economic", new Date(2022,12,5)));
		System.out.println(arr);
	}
}
