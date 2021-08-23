package Test04;

public class Ring {

	Circle inner;
	Circle outer;	
	
	public Ring(Circle inner , Circle outer) {
		this.inner = inner;
		this.outer = outer;
	}
	
	void output() {
		System.out.println("<내부 원 정보>");
		inner.output();
		System.out.println("\n<바깥 원 정보>");
		outer.output();
	}
}
