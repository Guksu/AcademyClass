package Ex;

//join은 해당 스레드가 끝날떄 까지 기다리는 메소드
class Join extends Thread{

	@Override
	public void run() {
		synchronized (this) {
			for(int i =0; i<5; i++) {
				System.out.println(i+"번 실행(Join)");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				
		}
	}
	
}
class Join2 extends Thread{
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i =0; i<5; i++) {
				System.out.println(i+"번 실행(Join2)");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
}
public class Ex07_Join {
	public static void main(String[] args) {

		Join j1 =new Join();
		Join2 j2 =new Join2();
		
		System.out.println("Main Start");
		
		try {
			j1.start();
			j1.join();
			
			j2.start();
			j2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main End");
		
		
	}
}
