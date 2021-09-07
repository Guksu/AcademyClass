package Test;


public class Test01 extends Thread{
//		Q1. Test01.java
//		Thread 클래스를 상속받아 2개의 쓰레드의(메인 스레드 포함)
//		동작 완료 시간을 출력
//		★System.currentTimeMillis(),
//		 sleep((int)(Math.random()*1000)) 이용
	@Override
	public void run() {
		long s_time;
		long e_time;
		
		try {
			s_time = System.currentTimeMillis();
			Thread.sleep((int)(Math.random()*1000));
			e_time = System.currentTimeMillis();
			System.out.println("Test time :" +(e_time-s_time));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Test01 test = new Test01();
		test.start();
		
		long s_time;
		long e_time;
		
		try {
			s_time = System.currentTimeMillis();
			Thread.sleep((int)(Math.random()*1000));
			e_time = System.currentTimeMillis();
			System.out.println("Main time :" +(e_time-s_time));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
