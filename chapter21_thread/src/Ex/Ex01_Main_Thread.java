package Ex;

public class Ex01_Main_Thread {
	public static void main(String[] args) {

		for(int i =0; i<10; i++) {
			try {
				Thread.sleep(2000);//2초간격으로 동작을 실행  // 예외처리 필수 !
				System.out.println("MainThread"+(i+1)+"번 출력");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
		}
	}
}
