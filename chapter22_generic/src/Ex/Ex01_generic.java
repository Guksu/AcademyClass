package Ex;

class Box{
	
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}

class BallPen{
	
}

class Pencil{
	
}

public class Ex01_generic {
	public static void main(String[] args) {

		Box box = new Box();
		
		box.setObj(new BallPen());
		System.out.println((BallPen)box.getObj());
		System.out.println("==============");
		box.setObj(new Pencil());
		System.out.println((Pencil)box.getObj());
		
	}
}
