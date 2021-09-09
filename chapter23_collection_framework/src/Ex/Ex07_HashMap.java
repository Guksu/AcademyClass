package Ex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex07_HashMap {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		map.put("Admin", 1234);
		map.put("Admin2", 4321);
		map.put("Haker", 9999);
		map.put("Me", 4444);
		map.put("Me", 7777);  //key 가 중복되면  나중값이 덮어쓴다
		
		map.remove("Haker");
		
		System.out.println(map);
		System.out.println(map.size());
		
		//반복자는 key에 따라 순회한다
		Set<String> key = map.keySet();
		Iterator<String> itr = key.iterator();
		
		while(itr.hasNext()) {
			String key2 = itr.next();
			Integer value = map.get(key2);
			System.out.println(key2+":"+value);
		}
	}
}
