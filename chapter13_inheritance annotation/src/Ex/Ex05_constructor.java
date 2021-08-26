package Ex;

class Animal{
	String name;
	public Animal() {}
	public Animal(String name) {
		this.name = name;
	}
}

class Dog extends Animal{
	String personName;
	public Dog(String personName) {
		super();    //public Animal() {} 호출
		this.personName = personName;
	}
	
	public Dog(String name,String personName) {
		super(name);    //public Animal(String name) 호출
		this.personName = personName;
	}
	
	void whoAmI() {
		System.out.println("이름은 :"+ name+"이고, 주인은"+ personName+"이다.");
	}
}

public class Ex05_constructor {
	public static void main(String[] args) {

		Dog dog = new Dog("dogdog","kim");
		Dog dog2 = new Dog("godgod","kim");
		dog.whoAmI();
		dog2.whoAmI();
		
	}
}
