package Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class Board{
	private String title;
	private String content;
	private String register;
	
	public Board(String title, String content, String register) {
		this.title = title;
		this.content = content;
		this.register = register;
	}

	@Override
	public String toString() {
		return "[제목 = " + title + ", 내용 = " + content + ", 날짜 = " + register + "]";
	}

}
public class Test01 {
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
		
		
		//simply가 왜 안 될까
		ArrayList<Board> arr = new ArrayList<Board>();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		String now = format1.format(new Date());
		arr.add(new Board("Number1","Game", now));
		arr.add(new Board("Number2", "Drama", now));
		arr.add(new Board("Number3", "Economic", now));
		System.out.println(arr);
		arr.remove(1);
		System.out.println(arr);
	}
}
