package Ex;

class MusicBox{
	public void rock() {
		for(int i =0; i<10; i++) {
			System.out.println("play the rock");
			try {
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
		}
	}
	
	public void ballad() {
		for(int i =0; i<10; i++) {
			System.out.println("play the ballad");
			try {
				Thread.sleep(((int)Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
		}
	}
	
	public void dance() {
		for(int i =0; i<10; i++) {
			System.out.println("play the dance");
			try {
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
		}
	}
}

class MusicPlayer extends Thread{
	private int type;
	private MusicBox musicbox;
	
	public MusicPlayer(int type, MusicBox musicbox) {
		this.type = type;
		this.musicbox = musicbox;
	}

	@Override
	public void run() {
		switch (type) {
		case 1: musicbox.rock();
			break;
		case 2 :musicbox.ballad();
			break;
		case 3 :musicbox.dance();
			break;
		default:
			break;
		}
	}
	
	
}
public class Ex04_ObjectShare {
	public static void main(String[] args) {

		MusicBox m = new MusicBox();
		MusicPlayer player1 = new MusicPlayer(1, m);
		MusicPlayer player2 = new MusicPlayer(2, m);
		MusicPlayer player3 = new MusicPlayer(3, m);
		
		player1.start();
		player2.start();
		player3.start();
	}
}
