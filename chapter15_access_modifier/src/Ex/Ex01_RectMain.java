package Ex;

public class Ex01_RectMain {
	public static void main(String[] args) {
	
		Ex01_Rect rect1 = new Ex01_Rect();
		Ex01_Rect rect2 = new Ex01_Rect(2);
		Ex01_Rect rect3 = new Ex01_Rect(10,20);
		
		rect1.output();
		System.out.println("==========");
		rect2.output();
		System.out.println("==========");
		rect3.output();
	}
}
