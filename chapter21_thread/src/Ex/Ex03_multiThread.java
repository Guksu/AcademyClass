package Ex;

class MyThread2 implements Runnable{
	private String str;

	public MyThread2(String str) {
		this.str = str;
	}

	@Override
	public void run() {
		for(int i =0; i<10; i++) {
			System.out.println(str);
			try {
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
		}
		System.out.println("Thread End");
	}	


}

public class Ex03_multiThread {
	public static void main(String[] args) {

		MyThread2 my1 = new MyThread2("*");
		MyThread2 my2 = new MyThread2("-");
		
		//start 메소드는 Thread의 메소드이므로 Thread 객체를 생성해야한다
		Thread t1 = new Thread(my1);
		Thread t2 = new Thread(my2);
		
		t1.start();
		t2.start();
	}
}
