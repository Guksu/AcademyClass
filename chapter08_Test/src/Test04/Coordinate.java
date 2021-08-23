package Test04;

public class Coordinate {

	int x, y;
	
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void output() {
		System.out.println("좌표 :[" + x + "," + y + "]");
	}
}
