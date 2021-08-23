package Test02;

public class Song {

	String title , country;
	
	public Song(String title, String country) {
		this.title = title;
		this.country = country;
	}
	
	void output() {
		System.out.println("곡명 :"+title);
		System.out.println("나라 :"+country);
	}
}
