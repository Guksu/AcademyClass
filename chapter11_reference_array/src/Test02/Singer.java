package Test02;

public class Singer {

	String name;
	Song[] songList;
	int idx;
	
	public Singer() {}
	
	public Singer(String name, int songCount) {
		this.name = name;
		if(songCount >=1) {			
			songList = new Song[songCount];
		}
	}
	
	void setSong(Song song) {
			songList[idx++] = song;      // 이거는 songList[idx] = song;    idx ++; 과 같은 코드
	}
	void output() {
		System.out.println("이름"+name);
//		for(Song song : songList) {
//			song.output();
//		}  향상된 for 문
		for( int i=0; i<songList.length; i++) {
			songList[i].output();
		}
	}
}
