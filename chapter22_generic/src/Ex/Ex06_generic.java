package Ex;

import java.util.Arrays;

class Basket<T>{
	private T[] foods;

	@SuppressWarnings("unchecked")
	public Basket(int num) {
		foods = (T[])new Object[num];
	}

	public void add(T food) {
		for(int i =0; i<foods.length; i++) {
			if(foods[i] == null) {
				foods[i] = food;
				break;
			}
		}
	}
	public T[] getFoods() {
		return foods;
	}
}

class Food{

	@Override
	public String toString() {
		return "Food";
	}
	
}

class Apple extends Food{

	@Override
	public String toString() {
		return "Apple";
	}
	
}

class Banana extends Food{

	@Override
	public String toString() {
		return "Banana";
	}
	
}

class Bread extends Food{

	@Override
	public String toString() {
		return "Bread";
	}
	
}

class Computer{

	@Override
	public String toString() {
		return "Computer";
	}
	
}
public class Ex06_generic {
	public static void main(String[] args) {

		Basket<Food> bas = new Basket<Food>(5);
		bas.add(new Apple());
		bas.add(new Banana());
		bas.add(new Bread());
		//bas.add(new Computer());  // 얘도 포함시키려면 T를 Object로 지정
		
		System.out.println(Arrays.toString(bas.getFoods()));
	}
}
