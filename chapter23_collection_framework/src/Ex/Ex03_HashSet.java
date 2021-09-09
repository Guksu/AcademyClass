package Ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex03_HashSet {
	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		
		set.add("Java");
		set.add("Spring");
		set.add("Web2");
		set.add("Jsp");
		set.add("DB");
		set.add("Spring");  //중복 저장 시도
		System.out.println(set);
		System.out.println("=========");
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			String str = itr.next();
			if(str.equals("Spring")) {
				itr.remove();
			}
		}
		System.out.println("============");
		System.out.println(set);
	}
}
