package chapter07_Test03;

//Q3.
//클래스 Dog을 정의하시오.
//- 필드 : String name, String breed, int age
//- 메소드 : setDog(name, age) : 품종은 푸들
//		setDog(name, age, breed) 
//		info(name, age, breed)
//		
public class DogMain {
	public static void main(String[] args) {
		
		Dog dg1 = new Dog();
		Dog dg2 = new Dog();
		
		dg1.setDog("Mung", 4);
		dg2.setDog("Ha", 5, "SSS");
		
		dg1.info();
		System.out.println("==========");
		dg2.info();
	}
}
