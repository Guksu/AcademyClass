package Test;

interface Providable{
	void sightseeing();
	void leisure();
	void food();
}

class KoreaTour implements Providable{

	@Override
	public void sightseeing() {
		System.out.println("남산");
	}

	@Override
	public void leisure() {
		System.out.println("등산");
	}

	@Override
	public void food() {
		System.out.println("김치");
	}

}
class GuamTour implements Providable{
	@Override
	public void sightseeing() {
		System.out.println("바다");
	}

	@Override
	public void leisure() {
		System.out.println("수영");
	}

	@Override
	public void food() {
		System.out.println("망고");
	}
}

class TourGuide{
	Providable tour;
	
	public TourGuide(Providable tour) {
		this.tour = tour;
	}
	public void sightseeing() {};
	public void leisure() {};
	public void food() {};
}

public class Test02 {

	public static void main(String[] args) {
//		Q2. Test02.java
//		interface Providable		메소드: sightseeing(), leisure(), food()
//		class KoreaTour				메소드 : Providable 구현을 통해생성
//		class GuamTour				메소드 : Providable 구현을 통해생성
//		class TourGuide				필드 : Providable tour
//									메소드 : sightseeing(), leisure(), food()

		
		//인터페이스도 상속의 개념이랑 비슷하므로 자식요소로 취급하여 업캐스팅 할 수 있다
		TourGuide guide1 = new TourGuide(new KoreaTour());
		TourGuide guide2 = new TourGuide(new GuamTour());
		
		((KoreaTour)guide1.tour).sightseeing();
		((KoreaTour)guide1.tour).leisure();
		((KoreaTour)guide1.tour).food();
		
		System.out.println("============");
		((GuamTour)guide2.tour).sightseeing();
		((GuamTour)guide2.tour).leisure();
		((GuamTour)guide2.tour).food();
	}
}
