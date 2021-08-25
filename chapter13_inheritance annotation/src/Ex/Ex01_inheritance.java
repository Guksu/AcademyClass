package Ex;

//부모 클래스
class Parent{
	
}
//자식 클래스
class Child extends Parent{
	
}

public class Ex01_inheritance {

	public static void main(String[] args) {

		//상속은 기존 클래스를 재활용 하는 것으로  기존 클래스를 확장(extends)하는것이다
		//private 접근 제한을 갖는 필드(변수)와 메소드는 상속 대상에서 제외된다
		//class 자식클래스(서브클래스) extends 부모클래스(슈퍼클래스)
		//한개의 클래스만 상속 가능하다.

		//자식클래스는 부모클래스의 메소드를 다시 만들 수 있다 .  이를 <오버라이드>이라 한다.   //<오버로딩은 같은 메소드를 다른 매개변수를 입력하여 사용하는것>
		//@Override(어노테이션의 한 종류)을 붙이면 오버라이드 한 메소드임을 구별할 수 있다.
		
		
	}

}
