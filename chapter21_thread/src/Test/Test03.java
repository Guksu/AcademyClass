package Test;
class GugudanPlay2{
	
	public void play(int dan) {

		synchronized (this) {
			for(int i =1; i<10; i++) {
				System.out.println(dan+" * "+i+" = "+dan*i);
			}
		}
	}
}

class Gugudan2 extends Thread{
	private int dan;
	GugudanPlay2 gugudan;
	public Gugudan2(int dan, GugudanPlay2 gugudan) {
		this.dan = dan;
		this.gugudan = gugudan;
	}
	@Override
	public void run() {
		gugudan.play(dan);
	}
}
public class Test03 {

	public static void main(String[] args) {

		//Q3. Test03.java
		//멀티 스레드를 이용하여 구구단을 출력(동기화 O)
		//class GugudanPlay2	메소드 : play()
		//class Gugudan2		필드 : int dan, GugudanPlay2 gugudan
		//					메소드 : 생성자 , run()
		//class Main
		// - 참조 배열 이용, 개별 객체 이용(2가지 모두 구현)

		
		Gugudan2[] gugu = new Gugudan2[8];
		
		for( int i =0; i<gugu.length; i++) {
			gugu[i] = new Gugudan2(i+2, new GugudanPlay2());
			gugu[i].gugudan.play(i+2);
			System.out.println("================");
		}
	}

}
