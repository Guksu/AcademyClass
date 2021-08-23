package Test02;

public class Singer {

	String name;
	Song song; //song클래스를 전부 받았다는 뜻
//	Song so = new Song("나는 가수다","한국");
	
	public Singer(String name) {
		this.name = name;
	}
	
	void setSong(Song s) {
		song = s;
	}
	
	void output() {
		System.out.println("가수명 :"+ name);
		song.output();
	}
}
