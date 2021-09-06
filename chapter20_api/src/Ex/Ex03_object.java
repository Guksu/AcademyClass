package Ex;

class Person implements Cloneable{ //clone을 사용하기 위해서 반드시 구현해야한다
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "이름 :"+name+", 나이 :"+age;
	}

	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	
}
public class Ex03_object {

	public static void main(String[] args) {
		Person per = new Person("k",28);
		System.out.println(per);
		
		Person clonePer = (Person)per.clone();
		System.out.println(clonePer);
	}
}
