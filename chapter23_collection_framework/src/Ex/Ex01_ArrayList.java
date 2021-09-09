package Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		//ArrayList만 가지고 있는 메소드를 사용시 List 말고 ArrayList를 사용해야한다.
		//ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(25);	//Auto-Boxing
		list.add(new Integer(2));//2를 객체를 만들어서 저장
		list.add(1,4);
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.size());
		list.remove(2);
		System.out.println(list);
		list.clear();
		System.out.println(list);
		//배열 정렬방법
		Collections.sort(list);
	}
}
