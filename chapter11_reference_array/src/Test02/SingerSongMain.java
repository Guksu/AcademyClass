package Test02;

public class SingerSongMain {

	public static void main(String[] args) {
//
//		Q2. 
//		Song.java				- 필드 : String title, String country
//								- 메소드 : Constructor, output
//		Singer.java				- 필드 : String name, 
//										Song[] songList(Song의 객체 n개를 메인으로부터 받아서 처리),
//					 					int idx(배열 인덱스에 접근용도)						
//								- 메소드 : Constructor, setSong(song), output
//								
//		SingerSongMain.java


		Singer singer = new Singer("Kim", 3);
		
		singer.setSong(new Song("title1", "한국"));
		singer.setSong(new Song("title2", "미국"));
		singer.setSong(new Song("title3", "중국"));
		
		singer.output();
	}
}
