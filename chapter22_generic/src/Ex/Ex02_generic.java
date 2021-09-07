package Ex;

class Bag<T>{   //<T>는 자료형 // 원시타입은 원시타입을 적어야 한다
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}

class Ball{
	
}

class Pen{
	
}

public class Ex02_generic {
	public static void main(String[] args) {

		Bag<Ball> bagBall = new Bag<Ball>();
		bagBall.setObj(new Ball());
		//bag은 ball 전용이므로 다운캐스팅을 할 필요가 없다. //(getObj에 T가 붙어있음)
		System.out.println(bagBall.getObj());
		
		Bag<Pen> bagPen = new Bag<Pen>();
	}
}
