package Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Member{
	private int no;
	String name, memberShip;
	public Member(int no, String name, String memberShip) {
		this.no = no;
		this.name = name;
		this.memberShip = memberShip;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Member) {
			String perName = ((Member)obj).name;
			return name.equals(perName);
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return name.charAt(0)*no;
	}
	@Override
	public String toString() {
		return "이름 : "+name+"포인트 점수:"+no+"memberShip: "+memberShip;
	}
	
	
}
public class Test03 {
	public static void main(String[] args) {
//		Q3. Test03.java
//		hashMap을 이용 하여 회원(Member)을 저장하시오.
//		key : Member, value : 포인트 점수 
//		동일한 회원은 저장될 수 없다. (map 사용시 중복 데이터 방지를 위해 hashCode(), equals()를 오버라이드 해야 한다.)
//
//		Member 클래스 			필드 :int no, String name, String memberShip
//							memberShip은 "VIP", "GOLD", "SILVER" 중 하나
//						메소드 : 생성자, hashCode, equals, toString
//		3명의 회원정보를 저장하시오.
//		중복 회원도 입력하시오.
		
		Map<String , Integer> member = new HashMap<>();
		member.put("Kim", 250);
		member.put("Jim", 300);
		member.put("Min", 450);
		member.put("Kim", 250);
		
		Set<String> key = member.keySet();
		Iterator<String> itr = key.iterator();

		while(itr.hasNext()) {
			String key2 = itr.next();
			Integer value = member.get(key2);
			System.out.println(key2+" :"+value);
		}
	}
}
