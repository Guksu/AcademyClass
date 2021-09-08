package Test;

class Product<T1, T2>{
	private T1 category;
	private T2 model;
	
	public void setCategory(T1 category) {
		this.category = category;
	}
	public void setModel(T2 model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return category +","+ model;
	}
	
}

class Elec{

	@Override
	public String toString() {
		return "전자제품";
	}
	
}
class Tv{

	private String tv;
	public Tv(String tv) {
	this.tv =tv;
	}

	@Override
	public String toString() {
		return tv;
	}
}
class Life{

	@Override
	public String toString() {
		return "가전제품";
	}
	
}
class Cup{
	private String cup;
	public Cup(String cup) {
	this.cup =cup;
	}

	@Override
	public String toString() {
		return cup;
	}
}
public class Test03 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		Q3. Test03.java
//		1. 메인클래스를 보고 알맞은 클래스들을 구현하시오.
//		2. Product 클래스를 구현하시오.
//			필드 : T1 category, T2 model
//			적절한 메소드 구현하기
//			
//		public static void main(String[] args) {
//
			Product<Elec, Tv> product1 = new Product<>();

			product1.setCategory(new Elec());
			product1.setModel(new Tv("LG"));
//			
			System.out.println(product1);			// 출력 예시) 전자제품, LG TV

	}

}
