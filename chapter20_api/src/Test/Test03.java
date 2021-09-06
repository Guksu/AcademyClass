package Test;

class Coordinate{
	private int x,y;

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj !=null && obj instanceof Coordinate) {
			return x == ((Coordinate)obj).x&&
					y == ((Coordinate)obj).y;
		}else {
			return false;
		}
	}
}

class Circle extends Coordinate{
	Coordinate cneter;
	double radius;
	
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj)&&
				radius == ((Circle)obj).radius;
	}


	
}
public class Test03 {
	public static void main(String[] args) {
//		Q3. Test03. java							
//		
//		Coordinate 클래스				필드 : int x, int y;
//									메소드 : Constructor, equals							
//		Circle 클래스					필드 : Coordinate center, double radius	
//									메소드 : Constructor, equals	
//		new Circle(0, 0, 1.5) // 중심 좌표[0,0], 반지름 : 1.5	

		Circle cr1 = new Circle(0, 0,1.5);
		Circle cr2 = new Circle(0, 1,1.5);
		
		System.out.println(cr1.equals(cr2));
	}
}
