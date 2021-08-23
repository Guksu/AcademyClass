package Test02;

public class SingerSongMain {
	public static void main(String[] args) {
//		Q2.
//		Song.java				필드 - String title, String country
//								메소드 - Constructor, output
//		Singer.java				필드 - String name, Song song 
//								메소드 - COnstructor, setSong(s), output
//		SingerSongMain.java	
		Singer sg = new Singer("가수다");
		sg.setSong( new Song("나는 가수다","한국")); // song의 값을 setSong에 저장
		sg.output();
	}
}
