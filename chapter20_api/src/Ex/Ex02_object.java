package Ex;

class Computer{
	private String model;
	private int price;
	
	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		String info = "모델: "+model + ", 가격"+ price;
		return info;
	}

	@Override
	public boolean equals(Object obj) {
		//Object클래스를 매개변수로 받기 떄문에 obj를 computer 클래스로 변환 가능한지 물어봐야한다.
		if(obj != null && obj instanceof Computer) {
			return model.equals(((Computer)obj).model)  // 다운케스팅
					&& price == ((Computer)obj).price;  // 다운케스팅
		} else {
			return false;
		}
	}
	
}

public class Ex02_object {
	public static void main(String[] args) {
		Computer comp1 = new Computer("SS", 1000);
		Computer comp2 = new Computer("SS", 1000);
		System.out.println(comp1);  //toString은 문자열을 출력해주는 메소드이며 기본적으로 객체를 호출하면 자동적으로  toString이 호출된다
		System.out.println("=============");
		if(comp1 == comp2) {
			System.out.println("같은종류");
		}else {
			System.out.println("다른종류");
		}
		System.out.println("=============");
		if(comp1.equals(comp2)) {
			System.out.println("같은종류");
		}else {
			System.out.println("다른종류");
		}
		
	}
}
