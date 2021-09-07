package Test;

class GugudanPlay{
	
	public void play(int dan) {
		for(int i =1; i<10; i++) {
			System.out.println(dan+" * "+i+" = "+dan*i);
		}
	}
}

class Gugudan extends Thread{
	private int dan;
	GugudanPlay gugudan;
	public Gugudan(int dan, GugudanPlay gugudan) {
		this.dan = dan;
		this.gugudan = gugudan;
	}
	@Override
	public void run() {
		gugudan.play(dan);
	}
}
public class Test02 {

	public static void main(String[] args) {

		//Q2. Test02.java
		//멀티 스레드를 이용하여 구구단을 출력(동기화 X)
		//class GugudanPlay	메소드 : play()
		//class Gugudan		필드 : int dan, GugudanPlay gugudan
		//					메소드 : 생성자 , run()
		//class Main
		// - 참조 배열 이용

		Gugudan[] gugu = new Gugudan[8];
		
		for( int i =0; i<gugu.length; i++) {
			gugu[i] = new Gugudan(i+2, new GugudanPlay());
			gugu[i].gugudan.play(i+2);
			System.out.println("================");
		}
	}

}
