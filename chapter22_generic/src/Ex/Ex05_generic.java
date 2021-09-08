package Ex;

import java.util.Arrays;

class Container<T>{
	private T[] items;
	
	@SuppressWarnings("unchecked") //경고창 없애는 용도(현재 타입이 명확하지 않고 Object이기 떄문)
	public Container(int capacity) {
		items = (T[])new Object[capacity];
	}
	
	public void add(T item) {
		//break는 해당 if문만 종료시키지만, return은 해당 메소드가 호출된 곳까지 종료시킨다. 즉, if문을 포함한 메소드 자체를 종료시킨다.
		for(int i =0; i<items.length; i++) {
			if(items[i] == null) {
				items[i] = item;
				break;
			}
		}
	}

	public T[] getItems() {
		return items;
	}
	
}

class Gun{
	private String model;

	public Gun(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return model;
	}
	
}
public class Ex05_generic {
	public static void main(String[] args) {

		Container<Gun> con = new Container<Gun>(10);
		
		con.add(new Gun("first"));
		con.add(new Gun("Second"));
		con.add(new Gun("Third"));
		System.out.println(Arrays.toString(con.getItems()));
	}
}
