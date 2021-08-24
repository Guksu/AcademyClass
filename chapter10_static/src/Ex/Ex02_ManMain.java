package Ex;

public class Ex02_ManMain {
	public static void main(String[] args) {
		//	main 메소드에 static이 필요한 이유는
		//	main 메소드를 포함하는 클래스의 객체 생성 없이도 main을 호출하기 위함이다.
		Ex02_Man man = new Ex02_Man("kim", 28);
		
		man.output();
		System.out.println(Ex02_Man.GENDER);  // 클래스를 통한 접근
	}
}
