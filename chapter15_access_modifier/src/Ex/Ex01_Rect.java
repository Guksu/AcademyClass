package Ex;

public class Ex01_Rect {

	//필드는 이제 대부분 private로 지정하여 외부에서 접근하지 못하게 한다.
	private int width, height;
	private boolean isSquare;
	
	// 생성자
	public Ex01_Rect() {
		this(1,1);  		//모든 변수를 포함한 생성자가 있어야 가능한 방법 / 만약 String 필드를 추가하는 경우에는 아래의 3번째 생성자에  String을 매개변수로 추가해야한다.
		isSquare = true;
	}
	
	public Ex01_Rect(int side) {
		this(side, side);
		isSquare = true;
	}
	
	public Ex01_Rect(int width, int height) {
		this.width = width;
		this.height = height;
		isSquare = (width == height) ? true : false;
	}
	
	//getter & setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	//boolean 타입의 getter는 is~~식으로 생성된다.
	public boolean isSquare() {
		return isSquare;
	}

	public void setSquare(boolean isSquare) {
		this.isSquare = isSquare;
	}
	
	//메소드
	public void output() {
		System.out.println("너비 :" + width);
		System.out.println("높이 :" + height);
		System.out.println("크키 :" + clacArea());
		System.out.println("형태 :" + (isSquare ? "정사각형" : "직사각형"));
	}
	
	private int clacArea() {
		return getHeight()*getWidth();
	}
}
