package Test;

import java.util.ArrayList;

public class Data {
	//ArrayList를 이용하면 내가 원할 때 배열에 추가할 수 있다.(동적배열)
	// 기존의 배열 방식은 String[] arr = {배열내용};
	static ArrayList<String> str = new ArrayList<String>();
	
	public Data() {
		str.add("a");
		str.add("ab");
		str.add("abc");
		str.add("abcd");
		str.add("abcde");
		str.add("abcdef");
		str.add("abcdefg");
		str.add("abcdefgh");
	}
}
