package Ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class User{
	private String id, pw;

	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof User) {
			String other = ((User)obj).id;
			return id.equals(other);
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return id.charAt(0)+pw.length();
	}

	@Override
	public String toString() {
		return "아이디: "+id;
	}
	
}
public class Ex04_HashSet {
	public static void main(String[] args) {

		Set<User> set = new HashSet<User>();
		
		set.add(new User("admin","1234"));
		set.add(new User("admin","1234"));
		
		Iterator<User> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(set.size());
		
	}
}
