package Test02;

public class Song {
	
	String title, country;
	
	public Song() {}
	
	public Song(String title, String country) {
		this.title = title;
		this.country = country;
	}
	
	void output() {
		System.out.println("title :"+ title);
		System.out.println("country :"+country);
	}
}
