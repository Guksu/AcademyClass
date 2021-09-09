package Ex;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02_Iterator {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i =0; i<10; i++) {
			list.add(i,(i+1)*10);
		}
		System.out.println(list);
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
