package Ex;

class MyThread extends Thread{
	private String str;

	public MyThread(String str) {
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

public class Ex02_MultiThread {
	public static void main(String[] args) {

		//run 은 호출하는것뿐  //  start는 스레드 작업을 위한 호출 스택을 생성한 다음 run을 호출
		
		System.out.println("Main Thread Start!");
		MyThread my1 = new MyThread("*");
		MyThread my2 = new MyThread("-");
		my1.start();
		my2.start();
		System.out.println("Main End");
	}
}
