package Ex;

//synchronized(동기화)는 메소드에 붙여서 사용 가능 -> 여러개의 thread들이 공유 객체의 메소드를 사용할 때 , 메소드에 synchronized가 붙어있는 경우 먼저 호출한 메소드가 객체의 사용권(Monitoring Lock)을 얻는다.
// 											모니터링 락은 메소드가 종료되거나 wait() 같은 메소드를 만나기 전 까지 유지된다
// 혹은 synchronized블럭을 사용할 수 있다
class AnimalSound{
	public synchronized void dog() {
		for(int i =0; i<10; i++) {
			System.out.println("play the dog");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
		}
	}
	
	public synchronized void cat() {
		for(int i =0; i<10; i++) {
			System.out.println("play the cat");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
		}
	}
	public void bird() {
		synchronized(this){

			for(int i =0; i<10; i++) {
				System.out.println("play the bird");
				try {
					Thread.sleep((int)(Math.random()*1000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}  
			}
		}
	}
}

class Animal extends Thread{
	private int type;
	private AnimalSound sound;
	public Animal(int type, AnimalSound sound) {
		this.type = type;
		this.sound = sound;
	}
	@Override
	public void run() {
		switch (type) {
		case 1:
			sound.dog();
			break;
		case 2:
			sound.cat();
			break;
		case 3:
			sound.bird();
			break;
		default:
			break;
		}
	}
	
	
}
public class Ex05_synchronized {
	public static void main(String[] args) {

		AnimalSound sound = new AnimalSound();
		Animal ani1 = new Animal(1, sound);
		Animal ani2 = new Animal(2, sound);
		Animal ani3 = new Animal(3, sound);
		
		ani1.start();
		ani2.start();
		ani3.start();
	}
}
