package Ex;

class MyThread3 implements Runnable{
	static int tot;

	@Override
	public void run() {
		synchronized (this) {
			for(int i =0; i<5; i++) {
				System.out.println((i+1)+"더하기");
				tot+=i+1;
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
				
		}
	}
	
}
public class Ex06_synchronized {
	public static void main(String[] args) {

		Thread thread2 = new Thread(new MyThread3());
		thread2.start();
		
		synchronized (thread2) {
			System.out.println("다른 쓰레드가 완료될 때 까지 기다린다");
			try {
				thread2.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
