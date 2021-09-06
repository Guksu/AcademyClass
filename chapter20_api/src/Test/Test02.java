package Test;

class User{
	private String id, password;

	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj !=null && obj instanceof User) {
			return id.equals(((User)obj).id) &&
					password.equals(((User)obj).password) ;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "id :"+id+", password : "+password;
	}
	
	
}
public class Test02 {
	public static void main(String[] args) {
//		Q2. Test02.java
//		User 클래스 					필드 : String id, password
//									메소드 : Constructor, toString(), equals()
//		User 인스턴스를 2개 생성하고, 동등 비교(id, password 모두 같으면 동등) 결과 출력
//		각 인스턴스 정보는 toString 메소드를 통해 출력	
		User user1 = new User("Kim", "1234");
		User user2 = new User("Kim", "12345");
		
		System.out.println(user1.toString());
		System.out.println(user2.toString());
		System.out.println(user1.equals(user2));
	}

}
