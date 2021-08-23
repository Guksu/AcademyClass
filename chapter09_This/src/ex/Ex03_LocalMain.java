package ex;

public class Ex03_LocalMain {

	public static void main(String[] args) {

		Ex03_Local person1 = new Ex03_Local("kim", 28, "940525-111111");
		Ex03_Local person2 = new Ex03_Local("Mik", 28);
		
		person1.output();
		person2.output();
	}
}
