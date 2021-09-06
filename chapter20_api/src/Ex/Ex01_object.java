package Ex;

class Sample{

	@Override
	public String toString() {
		return "SAMPLE";
	}

}
public class Ex01_object {
	public static void main(String[] args) {

		Object object = new Object();
		System.out.println(object);
		
		object = 10;
		System.out.println(object);
		object = "Hello";
		System.out.println(object);
		
		object = new Sample(); // 업캐스팅
		System.out.println(object);  //객체만 출력 해도 toString이 자동적으로 출력됨
		System.out.println(object.toString());
	}
}
