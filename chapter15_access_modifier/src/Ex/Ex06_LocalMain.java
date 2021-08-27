package Ex;

public class Ex06_LocalMain {
	public static void main(String[] args) {

		Ex06_Local human1 = new Ex06_Local("Kim",28,"940525-111111");
		Ex06_Local human2 = new Ex06_Local("Mik",30);

		human1.output();
		System.out.println("===========");
		human2.output();
	}
}
